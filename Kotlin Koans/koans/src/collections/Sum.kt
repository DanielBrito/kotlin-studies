package collections

// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double = customer.orders.flatMap { it.products }.sumOf { it.price }

fun main() {
    val shop =
        Shop(
            "Walmart",
            listOf(
                Customer(
                    "Alice",
                    City("São Paulo"),
                    listOf(
                        Order(
                            listOf(
                                Product("Banana", 2.0),
                                Product("Apple", 3.0),
                            ),
                            true,
                        ),
                        Order(
                            listOf(
                                Product("Orange", 1.0),
                                Product("Pineapple", 4.0),
                            ),
                            false,
                        ),
                    ),
                ),
                Customer(
                    "Bob",
                    City("Rio de Janeiro"),
                    listOf(
                        Order(
                            listOf(
                                Product("Milk", 5.0),
                                Product("Bread", 3.0),
                            ),
                            true,
                        ),
                        Order(
                            listOf(
                                Product("Butter", 2.0),
                                Product("Cheese", 4.0),
                            ),
                            true,
                        ),
                    ),
                ),
            ),
        )

    println("Alice spent ${moneySpentBy(shop.customers[0])}")
    println("Bob spent ${moneySpentBy(shop.customers[1])}")
}
