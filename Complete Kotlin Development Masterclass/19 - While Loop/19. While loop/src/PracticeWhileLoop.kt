fun main(args: Array<String>) {
    var i = 0

    while(i < 10) {
        i++
        println("$i: Hello")
    }

    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var index = 0

    while(index < cats.size) {
        println("Hello ${cats[index]}")
        index++
    }

    println("Please enter a number:")

    val input = readLine() ?: ""
    val number = input.toInt()
    
    var j = 1
    var result = 1L
    
    while(j <= number) {
        result *= j
        j++
    }
    println("$number! = $result")
}