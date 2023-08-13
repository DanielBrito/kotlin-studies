fun main(args: Array<String>) {
    printGreeting()
}

fun printGreeting() {
    fun sayHi(name: String) {
        println("Hi $name how are you?")
    }

    while (true) {
        println("Please enter a name:")
        val name = readLine() ?: ""

        if(name == "") break

        sayHi(name)
    }
}