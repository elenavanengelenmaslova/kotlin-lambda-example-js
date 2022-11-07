package nl.vintik.sample

import externals.client_dynamodb.DynamoDB
import externals.client_dynamodb.ScanCommandInput
import externals.client_dynamodb.ScanCommandOutput
import kotlinx.coroutines.await
import nl.vintik.sample.model.Product
import nl.vintik.sample.model.Product.Companion.TABLE_NAME
import kotlin.js.Promise

class ProductsService(private val dynamoDbClient: DynamoDB) {
    suspend fun findAllProducts(): List<Product> {
        val products = mutableSetOf<Product>()
        val jobs = mutableListOf<Promise<ScanCommandOutput>>()

        console.log("Parallel scans set to : $parallelScanTotalSegments with page size $parallelScanPageSize")

        for (segment in 0 until parallelScanTotalSegments) {
            val input = object : ScanCommandInput {
                // omitted
                override var TableName: String?
                    get() = TABLE_NAME
                    set(value) {}
            }
            input.Segment = segment
            input.TotalSegments = parallelScanTotalSegments
            input.Limit = parallelScanPageSize
            scan(jobs, input, products)

        }
        Promise.all(jobs.toTypedArray()).await()

        console.log("number of Product: ${products.size}")
        return products.toList()
    }

    private fun scan(
        jobs: MutableList<Promise<ScanCommandOutput>>,
        input: ScanCommandInput,
        products: MutableSet<Product>
    ) {
        val result = dynamoDbClient.scan(input)
        jobs.add(result)
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
                    val newInput = object : ScanCommandInput {
                        // omitted
                        override var TableName: String?
                            get() = TABLE_NAME
                            set(value) {}
                    }
                    newInput.Segment = input.Segment
                    newInput.TotalSegments = input.TotalSegments
                    newInput.Limit = input.Limit
                    newInput.ExclusiveStartKey = it
                    scan(jobs, input, products)
                }
            }

        }.catch {
            console.log("Error: ${JSON.stringify(it)}")
        }
    }

    companion object {
        private const val parallelScanTotalSegments = 5
        private const val parallelScanPageSize = 25

    }
}