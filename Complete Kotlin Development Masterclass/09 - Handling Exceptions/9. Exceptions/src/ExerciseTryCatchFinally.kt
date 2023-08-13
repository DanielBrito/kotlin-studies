import java.lang.Exception

fun main(args: Array<String>) {
    println("What product do you want to buy?")
    val input1 = readLine()
    println("How many would you like?")
    val input2 = readLine()
    val price = 9.99
    try {
        val amount = input2?.toInt()
        println("$amount $input1 will cost ${amount?.times(price)}")
    } catch (e: Exception) {
        println("Cannot read amount")
        e.printStackTrace()
    } finally {
        println("Transaction completed")
    }
}