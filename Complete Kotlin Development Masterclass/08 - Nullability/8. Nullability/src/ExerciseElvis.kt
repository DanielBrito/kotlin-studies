fun main(args: Array<String>) {
    val productPrice = 29.99

    println("How many products would you like to buy?")

    val input = readLine()
    val purchasedProducts = input?.toInt() ?: 3

    println("Total is ${purchasedProducts * productPrice}")
}