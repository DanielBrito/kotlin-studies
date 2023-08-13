fun main(args: Array<String>) {
    val numbers = arrayListOf<Int>()

    println("Please introduce 10 numbers:")

    for (i in 1..10) {
        val input = readLine() ?: ""
        val number = input.toInt()

        number.takeIf { it % 2 != 0 }
            .takeUnless { it == 3 || it == 13 }
            ?.let { numbers.add(it) }
    }
    
    println(numbers)
}