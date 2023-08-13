fun main(args: Array<String>) {
    var catName: String? = "Chonkers"

    println(catName?.length) // 8
    println(catName?.length?.toString()) // 8

    catName = null

    println(catName?.length) // null
    println(catName?.length?.toString()) // null
}