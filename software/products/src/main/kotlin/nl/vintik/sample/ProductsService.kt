package nl.vintik.sample

import externals.client_dynamodb.AttributeValue
import externals.client_dynamodb.DynamoDB
import externals.client_dynamodb.ScanCommandInput
import externals.client_dynamodb.ScanCommandOutput
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.await
import kotlinx.coroutines.launch
import nl.vintik.sample.model.Product
import nl.vintik.sample.model.Product.Companion.TABLE_NAME
import kotlin.js.Promise

class ProductsService(private val dynamoDbClient: DynamoDB) {
    suspend fun findAllProducts(): List<Product> {
        val products = mutableSetOf<Product>()

        console.log("Parallel scans set to : $parallelScanTotalSegments with page size $parallelScanPageSize")

        Promise.all((0 until parallelScanTotalSegments).map { segment ->
            scan(createScanCommandInput(segment), products)
        }.toTypedArray()).await()

        console.log("number of Product: ${products.size}")
        return products.toList()
    }

    private fun scan(
        input: ScanCommandInput, products: MutableSet<Product>
    ): Promise<ScanCommandOutput> {
        val result = dynamoDbClient.scan(input)
        result.then { scanOutput ->
            scanOutput.Items?.forEach { productData ->
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
                    GlobalScope.launch { scan(createScanCommandInput(input.Segment, it), products).await() }
                }
            }
        }.catch {
            console.log("Error: ${JSON.stringify(it)}")
        }
        return result
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