fun main(args: Array<String>) {
    val info1 = Info<String>()
    info1.getLength("Some random string")

    val info2 = Info<Double>()
    info2.getLength(34.68574856)

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(3, 6, 5, 2, 8, 6, 7))
}

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }
}