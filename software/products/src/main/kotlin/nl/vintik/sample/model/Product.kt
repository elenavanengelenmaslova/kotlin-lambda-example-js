package nl.vintik.sample.model

data class Product(
    var id: String,
    var name: String,
    var price: Float
) {
    constructor() : this("", "", 0.0F)

    companion object {
        const val TABLE_NAME = "Products-JS-Example"
    }

}