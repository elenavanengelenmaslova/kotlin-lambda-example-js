package nl.vintik.sample

import externals.client_dynamodb.AttributeValue
import externals.client_dynamodb.DynamoDB
import externals.client_dynamodb.ScanCommandInput
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.await
import kotlinx.coroutines.launch
import nl.vintik.sample.model.Product
import nl.vintik.sample.model.Product.Companion.TABLE_NAME
import kotlin.js.Promise

class ProductsService(private val dynamoDbClient: DynamoDB) {
    suspend fun findAllProducts(): List<Product> {
        val products = mutableListOf<Product>()

        console.log("Parallel scans set to : $parallelScanTotalSegments with page size $parallelScanPageSize")

        (0 until parallelScanTotalSegments).map { segment ->
            scan(createScanCommandInput(segment), products)
        }

        console.log("total number of Product: ${products.size}")
        return products.toList()
    }

    private suspend fun scan(
        input: ScanCommandInput, products: MutableList<Product>
    ) {
        dynamoDbClient.scan(input).then { scanOutput ->
            scanOutput.Items?.map { productData ->
                products.add(
                    Product(
                        productData["id"].S as String,
                        productData["name"].S as String,
                        (productData["price"].N as String).toFloat()
                    )
                )
            }
            scanOutput.LastEvaluatedKey?.let {
                if (input.ExclusiveStartKey != it) {
                    GlobalScope.launch(Dispatchers.Default) {
                        scan(
                            createScanCommandInput(input.Segment, it),
                            products
                        )
                    }
                }
            }
        }.catch {
            console.log("Error: ${JSON.stringify(it)}")
        }.await()
        console.log("scan products total: ${products.size} for input: ${JSON.stringify(input)}")
    }

    private fun createScanCommandInput(segment: Number?, exclusiveStartKey: AttributeValue? = null): ScanCommandInput {
        val input = object : ScanCommandInput {
            // omitted
            override var TableName: String?
                get() = TABLE_NAME
                set(value) {}
        }
        input.Segment = segment
        input.TotalSegments = parallelScanTotalSegments
        input.Limit = parallelScanPageSize
        input.ExclusiveStartKey = exclusiveStartKey
        return input
    }

    companion object {
        private const val parallelScanTotalSegments = 5
        private const val parallelScanPageSize = 25

    }
}