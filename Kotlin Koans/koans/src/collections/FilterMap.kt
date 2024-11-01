package collections

// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City> = customers.map { it.city }.toSet()

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { it.city == city }

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

    println(shop.getCustomerCities())
    println(shop.getCustomersFrom(City("São Paulo")))
}
