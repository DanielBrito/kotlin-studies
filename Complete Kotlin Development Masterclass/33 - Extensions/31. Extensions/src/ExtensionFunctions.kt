fun main(args: Array<String>) {
    val name = "Michael"

    println(name.slim()) // prints "ichae"
}

fun String.slim() = this.substring(1, length-1)