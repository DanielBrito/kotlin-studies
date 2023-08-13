fun main(args: Array<String>) {
    val r = 63
    val area = calculateCircleArea(r)

    println("A circle with the radius $r has an area of $area")

    val people = listOf("Anna", "Bob", "William")

    for(person in people) {
        val message = personalisedGreeting(person)
        println(message)
    }
}

fun calculateCircleAreaVerbose(radius: Int): Double {
   val pi = 3.1415
   return pi * radius * radius
}

fun calculateCircleArea(radius: Int) = 3.1415 * radius * radius

fun personalisedGreeting(person: String): String {
    val greeting = when(person[0]) {
        'A' -> "Are you ok, $person?"
        'W' -> "What's up, $person?"
        else -> "Hi, $person!"
    }

    return greeting
}