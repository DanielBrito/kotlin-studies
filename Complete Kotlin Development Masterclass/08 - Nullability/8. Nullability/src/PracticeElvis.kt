fun main(args: Array<String>) {
    println("Input a message:")
    val message = readLine()

    println(message ?: "Hi, how are you?")

    println("Input a number:")

    val input = readLine()
    val number = input?.toInt()
    
    println("$number multiplied by 5 is ${number!! * 5}")
}