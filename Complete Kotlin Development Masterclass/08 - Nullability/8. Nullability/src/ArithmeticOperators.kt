fun main(args: Array<String>) {
    val a: Double? = 10.0

    println(a?.plus(3)) // 13.0
    println(a?.minus(3)) // 7.0
    println(a?.times(3)) // 30.0
    println(a?.div(3)) // 3.3333333333333335
    println(a?.rem(3)) // 1.0

    val b: Double? = null

    println(b?.plus(3)) // null
    println(b?.minus(3)) // null
    println(b?.times(3)) // null
    println(b?.div(3)) // null
    println(b?.rem(3)) // null
}