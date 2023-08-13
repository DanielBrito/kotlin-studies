fun main(args: Array<String>) {
    val animals = listOf("dog", "cat", "elephant", "hippo")
    
    println(animals.size)
    println(animals[1])

    val customers = arrayListOf("Alex", "John", "Michelle", "Judy")
    println(customers)

    val newCustomer = "Michael"
    customers.add(newCustomer)

    println(customers)

    val leavingCustomer = "John"
    customers.remove(leavingCustomer)

    println(customers)
}