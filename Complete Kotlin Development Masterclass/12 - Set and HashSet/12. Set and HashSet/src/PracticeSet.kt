fun main(args: Array<String>) {
    val colors = hashSetOf<String>()
    val colorsList = listOf("red", "green", "blue", "red")

    colors.addAll(colorsList)

    println(colors) // [red, green, blue]

    colors.remove("green")

    println(colors) // [red, blue]

    val objects = hashSetOf("laptop", "mouse", "phone", "bottle", "cup")
    val removeObjects = setOf("cup", "bottle", "phone")

    objects.removeAll(removeObjects)

    println(objects) // [laptop, mouse]
}