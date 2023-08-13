fun main(args: Array<String>) {
    val name = "John"

    when(val length = name.length) { // length = 4
        in 1..5 -> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characters is medium")
        else -> println("A name with $length characters is long")
    }
}