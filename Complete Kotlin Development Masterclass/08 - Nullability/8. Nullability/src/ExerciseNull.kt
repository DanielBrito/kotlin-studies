fun main(args: Array<String>) {
    println("Please insert a number:")

    val input = readLine()
    val number = input?.toDouble()?.times(7)
    
    println("Length of $number is ${number?.toString()?.length}")
}