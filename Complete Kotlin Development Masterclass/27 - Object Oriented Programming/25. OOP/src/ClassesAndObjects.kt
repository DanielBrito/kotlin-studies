fun main(args: Array<String>) {
    val table = Table()
    println(table.color)

    val myGarage = Garage()
    myGarage.car.drive()
}

class Table {
    var color: String = "white"
}

class MyCar {
    fun drive() {
        println("Driving along in my car")
    }
}

class Garage {
    val car = MyCar()
}