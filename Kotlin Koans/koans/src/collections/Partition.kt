package collections

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    customers
        .filter {
            val (delivered, undelivered) = it.orders.partition { it.isDelivered }
            undelivered.size > delivered.size
        }.toSet()

fun main() {
    val shop =
        Shop(
            "My Shop",
            listOf(
                Customer(
                    "Alice",
                    City("São Paulo"),
                    listOf(
                        Order(listOf(Product("Smartphone", 2000.0), Product("Headphone", 100.0)), true),
                        Order(listOf(Product("Smartphone", 2000.0), Product("Headphone", 100.0)), false),
                    ),
                ),
                Customer(
                    "Bob",
                    City("Rio de Janeiro"),
                    listOf(
                        Order(listOf(Product("Smartphone", 2000.0), Product("Headphone", 100.0)), true),
                        Order(listOf(Product("Smartphone", 2000.0), Product("Headphone", 100.0)), false),
                    ),
                ),
            ),
        )

    println(shop.getCustomersWithMoreUndeliveredOrders())
}
