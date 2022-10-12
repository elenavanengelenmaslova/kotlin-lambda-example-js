package nl.vintik.sample

import externals.client_dynamodb.DynamoDB
import externals.client_dynamodb.ScanCommandInput
import kotlinx.coroutines.*
import nl.vintik.sample.model.Product
import nl.vintik.sample.model.Product.Companion.TABLE_NAME
import kotlin.js.Promise

class ProductsService {
    suspend fun findAllProducts(): List<Product> {
        val products = mutableListOf<Product>()
        val jobs = mutableListOf<Promise<Unit>>()

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
            jobs.add(scan(input, products))

        }
        Promise.all(jobs.toTypedArray()).await()

        console.log("number of Product: ${products.size}")
        return products
    }

    private fun scan(
        input: ScanCommandInput,
        products: MutableList<Product>
    ): Promise<Unit> {
        val result = dynamoDbClient.scan(input)
        //TODO: needs pagination with LastEvaluatedKey
        return result.then {
            it.Items?.forEach { productData ->
                products.add(
                    Product(
                        productData["id"] as String,
                        productData["name"] as String,
                        productData["price"] as Float
                    )
                )
            }

        }.catch {
            console.log("Error: ${JSON.stringify(it)}")
        }
    }

    companion object {
        private val dynamoDbClient: DynamoDB = DynamoDB(mapOf("apiVersion" to "2012-08-10", "region" to "eu-west-1"))

        private const val parallelScanTotalSegments = 4
        private const val parallelScanPageSize = 25

    }
}