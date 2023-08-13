fun main(args: Array<String>) {
    val math = Math()

    println("3 + 7 = ${math.add(3, 7)}") // 3 + 7 = 10
    println("7 * 5 = ${math.mul(7, 5)}") // 7 * 5 = 35
    println("2 - 8 = ${math.sub(2, 8)}") // 2 - 8 = -6
    println("7 / 2 = ${math.div(7, 2)}") // 7 / 2 = 3
}

class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}