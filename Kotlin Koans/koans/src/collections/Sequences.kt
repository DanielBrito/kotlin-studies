package collections

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductByNew(customer: Customer): Product? =
    customer
        .orders
        .asSequence()
        .filter(Order::isDelivered)
        .flatMap(Order::products)
        .maxByOrNull(Product::price)

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrderedNew(product: Product): Int =
    customers
        .asSequence()
        .flatMap(Customer::getOrderedProductsNewest)
        .count { it == product }

fun Customer.getOrderedProductsNewest(): Sequence<Product> = orders.asSequence().flatMap(Order::products)

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
    println("The most expensive product ordered by Alice is ${findMostExpensiveProductByNew(shop.customers[0])}")
    println("The most expensive product ordered by Bob is ${findMostExpensiveProductByNew(shop.customers[1])}")
    println("The number of times the Banana was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Banana", 2.0))}")
    println("The number of times the Apple was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Apple", 3.0))}")
    println("The number of times the Orange was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Orange", 1.0))}")
    println("The number of times the Pineapple was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Pineapple", 4.0))}")
    println("The number of times the Milk was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Milk", 5.0))}")
    println("The number of times the Bread was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Bread", 3.0))}")
    println("The number of times the Butter was ordered is ${shop.getNumberOfTimesProductWasOrderedNew(Product("Butter", 2.0))}")
}
