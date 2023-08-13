fun main(args: Array<String>) {
    Book().apply {
        printBook()
    }
        .also {
            println("LOG: Printing book $it")
            println("Sending an email about book $it")
        }
}

class Book {
    fun printBook() {
        println("Printing a book")
    }
}