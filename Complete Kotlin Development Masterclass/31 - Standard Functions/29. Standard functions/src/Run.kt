fun main(args: Array<String>) {
    val newCar = NewCar().run {
        speed = 70
        drive()
        println("NewCar is driving")
        this
    }

    println(newCar)

    run {
        val car2 = NewCar()

        car2.speed = 50
        car2.drive()
    }
    
    // println(car2) // -> Not available here
}

class NewCar {
    var speed = 10

    fun drive() {
        println("Car is driving at $speed")
    }
}