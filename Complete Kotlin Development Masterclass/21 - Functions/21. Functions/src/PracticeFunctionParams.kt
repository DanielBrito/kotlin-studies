fun main(args: Array<String>) {
    for(i in 1..3) {
        println(addition(i*5, i*9))
    }

    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))
    
    for(item in products.keys) {
        val finalPrice = addTax(products[item])
        println("$item cost $finalPrice")
    }
}

fun addition(p1: Int, p2: Int): Int {
    return p1 + p2
}

fun addTax(price: Double?) = price?.times(1.2)