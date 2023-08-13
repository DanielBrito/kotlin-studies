fun main(args: Array<String>) {
    val myCar = Car()
}

class Car {
    val model = "BMW"
    val topSpeed = 100

    init {
        println("This car is a $model and has a top speed of $topSpeed")
    }
}