fun main(args: Array<String>) {
    val numbers = setOf(3, 6, 4, null, 8)
    println(numbers.size) // 4

    println(numbers.contains(4)) // true
    println(numbers.contains(5)) // false

    println(numbers.containsAll(setOf(4, 6))) // true

    println(numbers.isEmpty()) // false
    println(setOf<Int>().isEmpty()) // true
}