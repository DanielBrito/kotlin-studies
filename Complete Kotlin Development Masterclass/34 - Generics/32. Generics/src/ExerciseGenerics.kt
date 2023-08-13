fun main(args: Array<String>) {
    val type1 = Type<Float>()
    type1.printMessage(36.453F)

    val type2 = Type<HashMap<String, Int>>()
    type2.printMessage(
        hashMapOf(
            Pair("one", 1), 
            Pair("two", 2), 
            Pair("fourty five", 45)
        )
    )
}

class Type<T> {
    fun printMessage(item: T) {
        println("The item converted to a String is ${item.toString()}")
    }
}