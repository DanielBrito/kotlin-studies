fun main(args: Array<String>) {
    val numbers = hashSetOf(3, 7, 5, null, 7)
    println(numbers) // [null, 3, 5, 7]

    val noNumbers = hashSetOf<Int>()
    println(noNumbers) // []

    numbers.add(44)
    println(numbers) // [null, 3, 5, 7, 44]

    val newNumbers = setOf(56, 34, 78)

    numbers.addAll(newNumbers)
    println(numbers) // [null, 3, 5, 7, 44, 34, 56, 78]

    numbers.remove(56)
    println(numbers) // [null, 3, 5, 7, 44, 34, 78]

    val toRemove = setOf(3, 5, 8745)
    numbers.removeAll(toRemove)
    
    println(numbers) // [null, 7, 44, 34, 78]
}