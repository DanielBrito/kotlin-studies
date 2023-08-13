fun main(args: Array<String>) {
    val customers = arrayListOf<Customer>()

    customers.add(Customer("Alice", "alice@gmail.com", 7))
    customers.add(Customer("Bob", "bob@gmail.com", 3))
    customers.add(Customer("Carol", "carol@gmail.com", 8))

    println(customers)

    val newCustomer = customers[1].copy(email = "bobsnewemail@gmail.com")
    
    customers.add(newCustomer)
    
    println(customers)

    sendEmail(customers)
}

fun sendEmail(customers: ArrayList<Customer>) {
    customers.forEach { 
        println("Sending an email to ${it.email}") 
    }
}

data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)