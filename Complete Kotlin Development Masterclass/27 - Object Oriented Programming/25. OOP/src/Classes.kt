fun main(args: Array<String>) {
    val myCar: Car = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Toyota"
    myCar.topSpeed = 150

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(75)
}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}