fun main(args: Array<String>) {
    println("Please enter a number:")
    val input = readLine()

    try {
        val number = input?.toInt()
        println("$number * 5 = ${number?.times(5)}")
    } catch (e: Exception) {
        println("The value '$input' is not a number")
        e.printStackTrace()
    }

    println("Please enter the distance you ran in km:")
    val input2 = readLine()
    
    try {
        val distanceKm = input2?.toDouble()
        println("$distanceKm km is ${distanceKm?.times(0.62)} miles")
    } catch (e: Exception) {
        println("Cannot read distance")
        e.printStackTrace()
    }
}