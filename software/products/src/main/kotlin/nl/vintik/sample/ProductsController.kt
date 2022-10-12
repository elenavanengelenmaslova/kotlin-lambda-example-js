package nl.vintik.sample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import nl.vintik.sample.model.Product

class ProductsController(
    private val productsService: ProductsService
) {
    fun execute(testMode: Boolean, callback: (err: String?, result: List<Product>?) -> Unit) {
        if (!testMode) {
            GlobalScope.launch(Dispatchers.Default) {
                callback(null, productsService.findAllProducts())
            }
        }
    }
}