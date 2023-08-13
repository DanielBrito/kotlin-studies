fun main(args: Array<String>) {
    println(multiply(5))
    println(multiply(7, 9))

    sayHello("John")
    sayHello(listOf("Alice", "Bob", "Carol"))
}

fun multiply(number: Int) = number * 2

fun multiply(number: Int, multiplier: Int) = number * multiplier

fun sayHello(person: String) {
    println("Hi $person")
}

fun sayHello(people: Collection<String>) {
    for(person in people) {
        println("Hi there $person")
    }
}