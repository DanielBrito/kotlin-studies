fun main(args: Array<String>) {
    val hasEggs = true
    val hasBacon = true

    val eggPrice = 5
    val baconPrice = 20
    var total = 0

    if(hasEggs) {
        total += eggPrice * 12
        
        if(hasBacon) {
            total += baconPrice * 2
        }
    } else {
        println("No eggs available")
    }

    println("Total is $total")
}