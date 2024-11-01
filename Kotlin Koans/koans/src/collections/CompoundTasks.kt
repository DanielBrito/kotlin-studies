package collections

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? =
    customer.orders
        .filter { it.isDelivered }
        .flatMap { it.products }
        .maxByOrNull { it.price }

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int =
    customers
        .flatMap(Customer::getOrderedProducts)
        .count { it == product }

fun Customer.getOrderedProductsNewer(): List<Product> = orders.flatMap(Order::products)

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

    println("Alice's most expensive product is ${findMostExpensiveProductBy(shop.customers[0])}")
    println("Bob's most expensive product is ${findMostExpensiveProductBy(shop.customers[1])}")
    println("Banana was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Banana", 2.0))} times")
    println("Apple was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Apple", 3.0))} times")
    println("Orange was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Orange", 1.0))} times")
    println("Pineapple was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Pineapple", 4.0))} times")
    println("Milk was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Milk", 5.0))} times")
    println("Bread was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Bread", 3.0))} times")
    println("Butter was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Butter", 2.0))} times")
    println("Cheese was ordered ${shop.getNumberOfTimesProductWasOrdered(Product("Cheese", 4.0))} times")
}
