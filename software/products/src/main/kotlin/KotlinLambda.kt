import nl.vintik.sample.ProductsController
import nl.vintik.sample.ProductsService
import nl.vintik.sample.model.Product

@JsExport
fun handleRequest(
    event: Any?,
    context: Any?,
    callback: (err: String?, result: List<Product>?) -> Unit
) {
    ProductsController(ProductsService()).execute(event == "unitTest", callback)
    console.log("Completed")
}