import nl.vintik.sample.ProductsController
import nl.vintik.sample.ProductsService

@JsExport
fun handleRequest(
    event: Any?,
    context: Any?,
    callback: (err: String?, result: String?) -> Unit
) {
    val result = ProductsController(ProductsService()).execute(event == "unitTest")
    console.log(result)
    callback(null, result)
}