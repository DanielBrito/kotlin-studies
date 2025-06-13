package list1

fun main() {
    print("Enter the measure in feet: ")
    val feet = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    val inches = feet * 12
    val yards = feet / 3.0
    val miles = yards / 1760.0

    println("Inches: $inches")
    println("Yards: $yards")
    println("Miles: $miles")
}
