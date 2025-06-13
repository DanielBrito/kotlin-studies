package list1

fun main() {
    print("Enter a base number: ")
    val baseNumber = readLine()!!.toDoubleOrNull() ?: return println("Invalid base")
    require(baseNumber > 0) { "Base number must be greater than 0" }

    print("Enter the exponent: ")
    val exponent = readLine()!!.toDoubleOrNull() ?: return println("Invalid exponent")
    require(exponent > 0) { "Exponent must be greater than 0" }

    val customPow: (base: Double, exponent: Double) -> Double = { base, exponent ->
        var result = 1.0
        repeat(exponent.toInt()) { result *= base }
        result
    }

    println("$baseNumber^$exponent = ${customPow(baseNumber, exponent)}")
}
