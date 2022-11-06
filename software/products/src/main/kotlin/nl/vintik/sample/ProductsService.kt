package nl.vintik.sample

import externals.client_dynamodb.DynamoDB
import externals.client_dynamodb.ScanCommandInput
import kotlinx.coroutines.await
import nl.vintik.sample.model.Product
import nl.vintik.sample.model.Product.Companion.TABLE_NAME
import kotlin.js.Promise

class ProductsService (private val dynamoDbClient: DynamoDB){
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
                        productData["id"].S as String,
                        productData["name"].S as String,
                        (productData["price"].N as String).toFloat()
                    )
                )
            }

        }.catch {
            console.log("Error: ${JSON.stringify(it)}")
        }
    }

    companion object {
        private const val parallelScanTotalSegments = 5
        private const val parallelScanPageSize = 400

    }
}