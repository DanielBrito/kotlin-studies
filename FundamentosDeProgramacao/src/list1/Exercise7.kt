package list1

fun main() {
    print("Enter a base number: ")
    val base = readLine()!!.toDoubleOrNull() ?: return println("Invalid base")
    require(base > 0) { "Base number must be greater than 0" }

    print("Enter the exponent: ")
    val exponent = readLine()!!.toDoubleOrNull() ?: return println("Invalid exponent")
    require(exponent > 0) { "Exponent must be greater than 0" }

    println("$base^$exponent (repeat) = ${powRepeat(base, exponent)}")
    println("$base^$exponent (fold) = ${powFold(base, exponent)}")
}

private fun powRepeat(base: Double, exponent: Double): Double {
    var result = 1.0
    repeat(exponent.toInt()) { result *= base }
    return result
}

private fun powFold(base: Double, exponent: Double) =
    List(exponent.toInt()) { base }.fold(1.0) { acc, value -> acc * value }
