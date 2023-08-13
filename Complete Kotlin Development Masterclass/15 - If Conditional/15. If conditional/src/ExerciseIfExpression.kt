fun main(args: Array<String>) {
    println("Input a number (1 to 100):")

    val input = readLine() ?: "0"
    val number = input.toInt()
    
    if(number > 100) {
        println("Wrong number introduced")
    } else {
        val grade = if (number >= 90) {
            "A"
        } else if (number >= 80) {
            "B"
        } else if (number >= 70) {
            "C"
        } else if (number >= 60) {
            "D"
        } else if (number >= 50) {
            "E"
        } else {
            "F"
        }

        println("You received grade $grade")
    }
}