package list1

import kotlin.math.cbrt
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Enter a positive number: ")
    val positiveNumber = readLine()!!.toDoubleOrNull() ?: return println("Number is invalid")

    require(positiveNumber > 0) { "Number must be greater than 0" }

    val squaredNumber = positiveNumber.pow(2.0)
    val cubedNumber = positiveNumber.pow(3.0)
    val squareRoot = sqrt(positiveNumber) // or positiveNumber.pow(1.0 / 2.0)
    val cubicRoot = cbrt(positiveNumber) // or positiveNumber.pow(1.0 / 3.0)

    val formatResult: (number: Double) -> String = { number -> String.format("%.2f", number) }

    println("Power of 2: ${formatResult(squaredNumber)}")
    println("Power of 3: ${formatResult(cubedNumber)}")
    println("Square root: ${formatResult(squareRoot)}")
    println("Cubic root: ${formatResult(cubicRoot)}")
}
