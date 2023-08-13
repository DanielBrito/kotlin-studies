fun main(args: Array<String>) {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")

    animals.map { it.length }
        .filter { it > 3 }
        // .let { filteredList ->
        //     println(filteredList)
        //     println("Size of list is ${filteredList.size}")
        // }
        // .let(::myPrint)
        .let(::println) // 5, 4, 5

    val name = readLine()

    name?.let {
        println("Your name is $it")
    }
}

fun myPrint(value: Any) {
    println(value)
}