fun main(args: Array<String>) {
    var catName: String? = null
    // println(catName!!.length) // Throws an exception if catName is null
    
    catName = "Mittens"
    println(catName!!.length) // 7
}