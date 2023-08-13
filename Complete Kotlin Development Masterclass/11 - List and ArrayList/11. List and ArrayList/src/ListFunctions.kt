fun main(args: Array<String>) {
    val colors = listOf("blue", "red", "blue", "green")

    println(colors.size) // 4
    println(colors.contains("red")) // true
    println(colors.contains("pink")) // false

    val newColors = listOf("red", "green", "teal")

    println(colors.containsAll(newColors)) // false
    println(colors.indexOf("red")) // 1
    println(colors.lastIndexOf("blue")) // 2
}