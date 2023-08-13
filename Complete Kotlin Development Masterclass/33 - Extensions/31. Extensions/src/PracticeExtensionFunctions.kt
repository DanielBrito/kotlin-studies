fun main(args: Array<String>) {
    println("SomeString".getCustomName())
    println(3.getCustomName())
    println(2.5F.getCustomName())
}

fun String.getCustomName() = "A string of characters"

fun Int.getCustomName() = "An integer number"

fun Float.getCustomName() = "A floating point number"