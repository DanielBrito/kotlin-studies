fun main(args: Array<String>) {
    val name = "Michael"

    println(name.betterLength) // 200
}

val String.betterLength: Int
    get() = 200