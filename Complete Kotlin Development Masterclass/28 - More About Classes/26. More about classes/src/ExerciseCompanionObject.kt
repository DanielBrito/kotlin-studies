fun main(args: Array<String>) {
    val myBook = Book(Book.getEditor())

    println(myBook.editor.editorName)
}

class Book(val editor: Editor) {
    companion object {
        fun getEditor() = Editor("O'Reilly")
    }
}

class Editor(val editorName: String)