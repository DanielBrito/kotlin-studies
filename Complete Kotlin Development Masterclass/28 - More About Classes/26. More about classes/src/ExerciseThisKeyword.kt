fun main(args: Array<String>) {
    val myTable = NewTable()
    
    myTable.printInfo()
    myTable.updateDimensions(150, 250)
    myTable.printInfo()
}

class NewTable {
    var height = 120
    var size = 200

    fun updateDimensions(height: Int, size: Int) {
        this.height = height
        this.size = size
    }

    fun printInfo() {
        println("Table height is $height and size is $size")
    }
}