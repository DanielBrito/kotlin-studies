fun main(args: Array<String>) {
    println(sumOfIntegers(4, 8, 5, 2, 6, 43, 3, 5, 6))
    println(sumOfIntegers(8, 4, 76, 32, 23, 56, 67))
    println(sumOfIntegers(3, 7, 3, 45 ,78, 34, 23, 7))
}

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0

    for (number in numbers) {
        sum += number
    }
    
    return sum
}