package collections

// Return true if all customers are from a given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city == city }

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city == city }

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? = customers.find { it.city == city }

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

    println(shop.checkAllCustomersAreFrom(City("São Paulo")))
    println(shop.hasCustomerFrom(City("São Paulo")))
    println(shop.countCustomersFrom(City("São Paulo")))
    println(shop.findCustomerFrom(City("São Paulo")))
}
