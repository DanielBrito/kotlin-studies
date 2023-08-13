fun main(args: Array<String>) {
    val attendance = hashMapOf(Pair("23 Sept", 3475), Pair("24 Sept", 4353), Pair("25 Sept", 3254))

    attendance["26 Sept"] = 9348

    val peopleOn25 = attendance["25 Sept"] ?: 0
    val peopleOn26 = attendance["26 Sept"] ?: 0

    println("People on the 25 and 26 of Sept: ${peopleOn25 + peopleOn26}")
    println("Is data available for 22 Sept? : ${attendance.containsKey("22 Sept")}")
}