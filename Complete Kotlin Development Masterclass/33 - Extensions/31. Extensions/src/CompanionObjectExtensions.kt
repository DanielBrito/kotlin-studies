fun main(args: Array<String>) {
    Book.printMe()
}

class Book {
    companion object {}
}

fun Book.Companion.printMe() {
    println("Book has been printed")
}