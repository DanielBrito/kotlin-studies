fun main(args: Array<String>) {
    val newUser by lazy { NewUser() }

    val banned = listOf("Alice", "Bob", "Carol")

    println("Please enter a username:")

    val input = readLine() ?: ""

    if(!banned.contains(input)) {
        newUser.printWelcome()
    }
}

class NewUser {
    fun printWelcome() {
        println("Welcome to the course!")
    }
}