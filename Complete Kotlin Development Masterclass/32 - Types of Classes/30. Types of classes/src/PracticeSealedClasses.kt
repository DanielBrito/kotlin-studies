fun main(args: Array<String>) {
    val myVehicle = getVehicle()

    when(myVehicle) {
        is Car -> println("A car is faster")
        is Bicycle -> println("A bicycle is more healthy")
    }
}

fun getVehicle(): Vehicle = Pegasus()

abstract class Vehicle

sealed class Car: Vehicle()

sealed class Bicycle: Vehicle()

class BMW: Car()

class Pegasus: Bicycle()