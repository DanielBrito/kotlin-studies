package collections

// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> = customers.associateBy(Customer::name)

// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> = customers.associateWith(Customer::city)

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> = customers.associate { it.name to it.city }

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

    println(shop.nameToCustomerMap())
    println(shop.customerToCityMap())
    println(shop.customerNameToCityMap())
}
