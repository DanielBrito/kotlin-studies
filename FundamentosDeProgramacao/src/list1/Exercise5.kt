package list1

import kotlin.math.PI

fun main() {
    print("Enter the radius: ")
    val radius = readLine()!!.toDoubleOrNull() ?: return println("Invalid radius")

    val circleArea = PI * radius * radius

    println("Area: ${String.format("%.2f", circleArea)}")
}
