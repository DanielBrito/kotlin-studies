fun main(args: Array<String>) {
    val myBox = Box()

    println("Contents is ${myBox.contents}")

    myBox.updateContents("Jewellery")
    
    println("Contents is ${myBox.contents}")
}

class Box {
    var contents: String = ""

    fun updateContents(contents: String) {
        this.contents = contents
    }
}