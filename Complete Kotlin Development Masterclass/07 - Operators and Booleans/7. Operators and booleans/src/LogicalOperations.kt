fun main(args: Array<String>) {
    val isDay = true
    val isEvening = true

    println(isDay && isEvening) // true

    println(false || false) // false

    val isNight = !isDay
    println(isNight) // false
}