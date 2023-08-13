fun main(args: Array<String>) {
    val car = WeirdCar()

    car.speed = 100
    
    println("car.name ${car.name}")
    println("car.speed ${car.speed}")
}

class WeirdCar {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "High speed car $value"
        }
}