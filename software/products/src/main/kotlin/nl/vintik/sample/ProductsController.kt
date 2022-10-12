package nl.vintik.sample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import nl.vintik.sample.model.Product

class ProductsController(
    private val productsService: ProductsService
) {

    fun execute(): List<Product>? {
        var result: List<Product>? = null

        val job = GlobalScope.launch(Dispatchers.Default) {
            result = productsService.findAllProducts()
        }
        while (result == null){
            //await
        }
        return result
    }

}