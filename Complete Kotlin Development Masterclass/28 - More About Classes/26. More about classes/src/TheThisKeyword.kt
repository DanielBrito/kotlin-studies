fun main(args: Array<String>) {
    val note = PostItNote()

    println(note.message) // No message
    note.printMessage() // No message

    note.updateMessage("Meeting at 5")

    println(note.message) // Meeting at 5
    note.printMessage() // Meeting at 5
}

class PostItNote() {
    var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(this.message)
    }
}