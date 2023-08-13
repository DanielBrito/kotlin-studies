fun main(args: Array<String>) {
    println("Please enter a value:")

    val input = readLine() ?: "0"
    val maxValue = input.toInt()
    
    for(i in maxValue downTo 0) {
        if(i % 7 == 0) {
            println(i)
        }
    }

    for(i in 1..10) {
        for(j in 1..i) {
            print("\uD83D\uDE00 ")
        }
        println()
    }
}