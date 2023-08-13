fun main(args: Array<String>) {
    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    count[5] = "five"
    
    println(count) // {1=one, 2=two, 3=three, 5=five}

    val countMore = mapOf(Pair(20, "twenty"), Pair(30, "thirty"))

    count.putAll(countMore)
    println(count) // {1=one, 2=two, 3=three, 5=five, 20=twenty, 30=thirty}

    count.remove(20)
    println(count) // {1=one, 2=two, 3=three, 5=five, 30=thirty}

    count.replace(2, "twotwo")
    println(count) // {1=one, 2=twotwo, 3=three, 5=five, 30=thirty}

    count.clear()

    println(count) // {}
    println(count.isEmpty()) // true
    println(count.size) // 0
}