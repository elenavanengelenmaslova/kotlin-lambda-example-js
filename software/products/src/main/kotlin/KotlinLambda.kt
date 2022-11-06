import externals.client_dynamodb.DynamoDB
import nl.vintik.sample.ProductsController
import nl.vintik.sample.ProductsService
import nl.vintik.sample.model.Product
import externals.xray.captureAWSClient

@JsExport
fun handleRequest(
    event: Any?,
    context: Any?,
    callback: (err: String?, result: List<Product>?) -> Unit
) {
    ProductsController(ProductsService(dynamoDbClient)).execute(event == "unitTest", callback)
    console.log("Completed")
}
//private val dynamoDbClient = captureAWSClient(DynamoDB(mapOf("apiVersion" to "2012-08-10", "region" to "eu-west-1")))
private val dynamoDbClient: DynamoDB = DynamoDB(mapOf("apiVersion" to "2012-08-10", "region" to "eu-west-1"))