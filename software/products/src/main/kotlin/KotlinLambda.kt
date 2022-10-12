import nl.vintik.sample.ProductsController
import nl.vintik.sample.ProductsService
import nl.vintik.sample.model.Product

@JsExport
fun handleRequest(
    event: Any?,
    context: Any?,
    callback: (err: String?, result: List<Product>?) -> Unit
) {
    val result = ProductsController(ProductsService()).execute(event == "unitTest")
    console.log(result)
    callback(null, result)
}