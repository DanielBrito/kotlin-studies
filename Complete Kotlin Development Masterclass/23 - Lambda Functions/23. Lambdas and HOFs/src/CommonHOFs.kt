fun main(args: Array<String>) {
    val clients = listOf("Anna", "Bob", "Carol", "Dan")

    clients.forEach { println("Hello $it") }
    clients.forEach { name: String -> println("Hello $name") }

    clients
        .filter { it.length < 5 } // Anna, Bob, Dan
        .forEach { println("Hello $it") }

    val sizes = clients.map { it.length }
    println(sizes) // [4, 3, 5, 3]

    val sorted = clients.sortedBy { it.length }
    println(sorted) // [Bob, Dan, Anna, Carol]

    val max = clients.maxBy { it.length }
    println(max) // Carol

    val min = clients.minBy { it.length }
    println(min) // Bob
}