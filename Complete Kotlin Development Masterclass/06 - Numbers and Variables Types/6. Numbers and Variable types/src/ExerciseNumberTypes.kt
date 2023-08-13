fun main(args: Array<String>){
    println("Please input a number:")

    val numberInput = readLine() ?: ""
    val number = numberInput.toInt()
    val d1 = 47.83
    val result = number * d1
    
    println(result)
    println(result::class.java)
}