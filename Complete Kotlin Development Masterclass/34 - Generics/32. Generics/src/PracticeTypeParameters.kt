fun main(args: Array<String>) {
    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Alice", "Bob", "Carol", "Bob"))

    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Dan", "Ellen", "Fran", "George", "Dan"))
}

class Printer<T: Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach { println(it.toString()) }
    }
}