fun main(args: Array<String>) {
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3,"three"))
    println(count) // {1=one, 2=two, 3=three}

    println(count[2]) // two
    println(count.keys) // [1, 2, 3]
    println(count.values) // [one, two, three]
    println(count.entries) // [1=one, 2=two, 3=three]

    val count2 = mapOf<Int, String>()
    println(count2) // {}
}