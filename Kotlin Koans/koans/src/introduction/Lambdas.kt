package introduction

private fun containsEven(collection: Collection<Int>) = collection.any { it % 2 == 0 }

fun main() {
    val containsEven = containsEven(listOf(1, 2, 3))

    println(containsEven)
}
