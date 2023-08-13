fun main(args: Array<String>) {
    printlnHello(5, "Mary", "John", "Alex", "Michelle")
}

fun printlnHello(count: Int, vararg names: String) {
    for(name in names) {
        for(i in 1..count) {
            print("Hello $name - ")
        }
        
        println()
    }
}