fun main(args: Array<String>) {
    var acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")

    acceptedColors.retainAll(myColors) // [black]

    println("I can only wear $acceptedColors")

    acceptedColors = hashSetOf("white", "black", "grey")
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors) // [black, red]

    println("Now I can wear $acceptedColors")
}