fun main(args: Array<String>) {
    val list = arrayListOf(3, 7, 5, 6, 8, 7, 9, 6, 4, 2, 5)

    println(list.howMany())
}

fun ArrayList<Int>.howMany() = "This list contains $size elements"