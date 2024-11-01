package collections

fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()

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

    println(shop.getSetOfCustomers())
}
