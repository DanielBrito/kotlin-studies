fun main(args: Array<String>) {
    val colors = listOf("blue", "red", "yellow")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("blue", "red", "blue", "green", "blue")
    println(colors3)

    val colors4: List<String?> = listOf("blue", "red", "blue", null, null)
    println(colors4)

    println(colors[0]) // blue
    println(colors.get(1)) // red
    println(colors3.size) // 5
}