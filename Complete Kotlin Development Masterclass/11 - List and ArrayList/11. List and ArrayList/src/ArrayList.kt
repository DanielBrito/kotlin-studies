fun main(args: Array<String>) {
    val colors = arrayListOf("blue", "red")
    println(colors) // [blue, red]

    val noColors = arrayListOf<String>()
    println(noColors) // []

    colors.add("yellow")
    println(colors) // [blue, red, yellow]

    val moreColors = arrayListOf("pink", "teal")
    colors.addAll(moreColors)
    println(colors) // [blue, red, yellow, pink, teal]

    colors.remove("red")
    println(colors) // [blue, yellow, pink, teal]

    colors.removeAll(moreColors)
    println(colors) // [blue, yellow]

    colors.removeAt(1)
    println(colors) // [blue]

    colors.add("red")
    colors.add("blue")

    println(colors) // [blue, red, blue]

    colors.remove("blue")

    println(colors) // [red, blue]
}