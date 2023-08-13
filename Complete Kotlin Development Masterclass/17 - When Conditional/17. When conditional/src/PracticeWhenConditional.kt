fun main(args: Array<String>) {
    println("How many meals do you have a day?")

    val input = readLine() ?: "3"
    val meals = input.toInt()

    when(meals){
        in 0..2 -> println("You should eat more")
        3 -> println("That's perfect")
        else -> println("You should eat less")
    }

    println("What is the current hour? (0-23)")

    val input2 = readLine() ?: "0"
    var hour = input2.toInt()

    if(hour > 23) hour = 23
    
    val timeOfDay = when(hour) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }
    
    println("At $hour:00 it's $timeOfDay")
}