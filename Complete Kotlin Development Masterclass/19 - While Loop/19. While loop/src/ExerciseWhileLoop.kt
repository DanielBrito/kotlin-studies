fun main(args: Array<String>) {
    println("Please enter a number:")

    val input = readLine() ?: ""
    val number = input.toInt()
    
    var i = 0
    
    while(i < number) {
        if(i % 7 == 0)
            println("$i is divisible by 7")
        i++
    }
}