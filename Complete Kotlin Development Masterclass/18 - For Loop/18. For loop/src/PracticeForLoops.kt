fun main(args: Array<String>) {
    for(i in 1..10) {
        println("#$i: Hello how are you")
    }

    var total = 0

    for(i in 1..100) {
        total += i
    }

    println("Total is $total") // 5050

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    
    for(customerName in customers.keys) {
        val purchases = customers[customerName]
        println("$customerName you purchased $purchases items")
    }
}