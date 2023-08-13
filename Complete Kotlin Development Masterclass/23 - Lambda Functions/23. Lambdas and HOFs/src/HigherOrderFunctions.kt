fun main(args: Array<String>) {
    sayHello(arrayListOf("Alice", "Bob", "Carol", "Dan"))
        { name: String -> println("Hello there $name") }

    // Is the same as:

    val myNames = arrayListOf("Alice", "Bob", "Carol", "Dan")
    val myLambda: (String) -> Unit = { name: String -> println("Hello there $name") }sayHello(myNames) { name: String -> println("Hello there $name") }
    
    sayHello(myNames, myLambda)
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}