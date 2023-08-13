fun main(args: Array<String>) {
    for(i in 1..3) {
        askDetails()
    }
}

fun askDetails() {
    println("Please enter your name:")
    val name = readLine() ?: ""

    println("Please enter your birth year:")
    val input = readLine() ?: ""
    val year = input.toInt()

    println("$name is ${2019-year-1} or ${2019-year} years old")
}