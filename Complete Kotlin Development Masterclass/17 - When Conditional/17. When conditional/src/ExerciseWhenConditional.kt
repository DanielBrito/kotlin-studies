fun main(args: Array<String>) {
    println("Please enter your name:")

    val name = readLine() ?: ""
    
    when(name[0]) {
        'A', 'B', 'C' -> println("Hello $name, welcome!")
        in 'D'..'F' -> println("Hi $name how are you")
        else -> println("Hi")
    }
}