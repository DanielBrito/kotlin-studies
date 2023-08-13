fun main(args: Array<String>) {
    val herName: String = "Lilly"
    val hisName: String? = null

    println(herName)
    println(hisName)

    var catName: String? = "Chonkers"
    catName = null

    var dogName: String = "Fluffy"
    
    // Compilation error - Null can not be a value of a non-null type String:
    // dogName = null 
}