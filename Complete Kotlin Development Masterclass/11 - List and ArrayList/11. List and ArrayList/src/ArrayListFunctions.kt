fun main(args: Array<String>) {
    val colors = arrayListOf("blue", "red", "blue", "green")
    colors.set(1, "redder")

    println(colors) // [blue, redder, blue, green]

    val subColors = colors.subList(1, 3)

    println(subColors) // [redder, blue]
    println(subColors::class.java) // class java.util.ArrayList

    colors.clear()

    println(colors) // []
    println(colors.isEmpty()) // true
}