fun main(args: Array<String>) {
    with(Car()) {
        speed = 80
        drive()
        println("Car is driving")
    }

    // with(Car()) {
    //     this.speed = 80
    //     this.drive()
    //     println("Car is driving")
    // }
}

class Car {
    var speed = 50

    fun drive() {
        println("Driving at $speed")
    }
}