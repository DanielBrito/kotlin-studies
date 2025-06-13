package list1

fun main() {
    print("Enter the base: ")
    val base = readLine()!!.toIntOrNull() ?: return println("Invalid base")

    print("Enter the height: ")
    val height = readLine()!!.toIntOrNull() ?: return println("Invalid height")

    val triangleArea = (base * height) / 2.0

    println("Area: ${String.format("%.2f", triangleArea)}")
}
