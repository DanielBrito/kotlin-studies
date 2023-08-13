fun main(args: Array<String>) {
    var count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))

    println("2 in french is ${count[2]}")
    println("3 in french is ${count[3]}")

    count.put(4, "quatre")
    println(count)

    val customers = hashMapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))
    
    println("Is Alice a customer? : ${customers.containsKey("Alice")}")
    println("Alice bought ${customers["Alice"]} products")
    println("Is Michael a customer? : ${customers.containsKey("Michael")}")
}