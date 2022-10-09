package nl.vintik.sample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ProductsController(
    private val productsService: ProductsService
) {
    fun execute(testMode: Boolean): String {
        if (!testMode) {
            GlobalScope.launch {
                productsService.findAllProducts()
            }
        }
        return "Success!"
    }
}