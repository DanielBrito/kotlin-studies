package collections

// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    customers
        .map(Customer::getOrderedProductsNew)
        .reduce { orderedByAll, customer ->
            orderedByAll.intersect(customer)
        }

fun Customer.getOrderedProductsNew(): Set<Product> = orders.flatMap(Order::products).toSet()

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

    println(shop.getProductsOrderedByAll())
}
