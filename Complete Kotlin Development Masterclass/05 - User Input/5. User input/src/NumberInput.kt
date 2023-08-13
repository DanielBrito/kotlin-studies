fun main(args: Array<String>) {
    println("Input a number:")

    val userInput = readLine() ?: ""
    
    println("Double is: ${userInput.toInt() * 2}")
}