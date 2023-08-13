fun main(args: Array<String>) {
    val a = 5
    val b = 1

    println("$a > $b will return ${a > b}") // true
    
    println(a<b) // false
    println(a>=b) // true
    println(a<=b) // false
    println(a==b) // false

    val result = a!=b

    println(result) // true
}