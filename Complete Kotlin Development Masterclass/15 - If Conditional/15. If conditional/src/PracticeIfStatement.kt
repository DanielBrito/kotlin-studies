fun main(args: Array<String>) {
    println("Do you have the keys? (yes/no)")

    val input = readLine() ?: ""
    var hasKeys = false

    if(input == "yes") {
        hasKeys = true
    }

    if(hasKeys) {
        println("Start the car")
    } else {
        println("Cannot start the car without keys")
    }

    println("Please input the current hour (0-23):")

    val input2 = readLine() ?: "0"
    val hour = input2.toInt()

    if(hour < 12) {
        println("It's $hour am")
    } else {
        if(hour == 12) {
            println("It's $hour pm")
        } else {
            println("It's ${hour - 12} pm")
        }
    }
}