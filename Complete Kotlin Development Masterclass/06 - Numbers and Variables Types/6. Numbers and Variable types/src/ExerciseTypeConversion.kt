fun main(args: Array<String>){
    println("Please enter a number of type double:")

    val numberInput = readLine() ?: ""
    val number = numberInput.toDouble()
    val pi = 3.14159
    val result = number * pi
    
    println("$result is of type ${result::class.java}")
}