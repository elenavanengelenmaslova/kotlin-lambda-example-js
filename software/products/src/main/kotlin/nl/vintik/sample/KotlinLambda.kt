package nl.vintik.sample

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