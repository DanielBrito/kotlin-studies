fun main(args: Array<String>) {
    val color = Colors.RED

    when (color) {
        Colors.RED -> println("You chose red")
        Colors.BLUE -> println("You chose blue")
        Colors.GREEN -> println("You chose green")
    }

    println(Colors.RED.timesUsed) // 34
    println(Colors.GREEN.name) // GREEN
    println(Colors.BLUE.ordinal) // 2
    println(Colors.RED.javaClass) // class Colors
}

enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(45)
}