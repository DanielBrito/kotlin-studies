fun main(args: Array<String>) {
    val numbers = setOf(3, 456, 34, 67, 4, 567, 37, 6575)
    println(numbers.filter { it in 10..99 }) // [34, 67, 37]

    val clients = listOf("Tom", "Laura", "Dennis", "Mark")
    println(clients.sortedBy { it[it.length-1] }) // [Laura, Tom, Dennis, Mark]

    val ints = listOf(372, 285, 836, 194, 836, 216)

    println(ints.maxBy { it.toString()[1].toInt() }) // 194
    println(ints.maxBy { it / 10 % 10 }) // 194
}