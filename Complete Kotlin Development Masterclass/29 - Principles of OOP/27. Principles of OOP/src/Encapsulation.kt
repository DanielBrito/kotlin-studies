fun main(args: Array<String>) {
    val myVehicle = MyVehicle()
    
    myVehicle.start()
}

open class Airplane {
    public val type = "Airbus"

    public fun fly() {
        println("lying")
    }
}

class MyAirplane: Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyVehicle() {
    fun start() {
        val airplane = Airplane()

        println(airplane.type) // Airbus

        airplane.fly()
    }
}