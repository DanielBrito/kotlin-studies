fun main(args: Array<String>) {
    var catName: String? = null

    // catName = "Fluffy"
    
    println(catName ?: "This cat has no name")
    println(catName ?: "Fluffy".length)
}