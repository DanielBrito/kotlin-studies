package list1

import kotlin.math.pow

fun main() {
    print("Enter a base number: ")
    val baseNumber = readLine()!!.toDoubleOrNull() ?: return println("Invalid base")
    require(baseNumber > 0) { "Base number must be greater than 0" }

    print("Enter the exponent: ")
    val exponent = readLine()!!.toDoubleOrNull() ?: return println("Invalid exponent")
    require(exponent > 0) { "Exponent must be greater than 0" }

    val result = baseNumber.pow(exponent)

    println("$baseNumber^$exponent = $result")
}
