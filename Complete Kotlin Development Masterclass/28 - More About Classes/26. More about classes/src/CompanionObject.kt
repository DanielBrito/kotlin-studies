fun main(args: Array<String>) {
    println(Car.provideDrivingInstructions())
}

class Car {
    companion object {
        fun provideDrivingInstructions() : String {
            return "Drive safe!"
        }
    }
}