fun main(args: Array<String>) {
    val numbers = setOf(6, 37, 6, 42)
    println(numbers) // [6, 37, 42]

    val numbers2 = setOf<Int>()
    println(numbers2) // []

    val numbers3: Set<Int?> = setOf(6, 5, 2, null, 8, 5, 7, null, 4, null)
    println(numbers3) // [6, 5, 2, null, 8, 7, 4]
}