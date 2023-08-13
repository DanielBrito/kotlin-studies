fun main(args: Array<String>) {
    val myPlane = Airplane()

    myPlane.takeOff()
}

class Airplane {
    private val engine1 = Engine("engine1")
    private val engine2 = Engine("engine2")

    fun takeOff() {
        println("Getting ready for take off")

        engine1.startEngine()
        engine2.startEngine()
        
        println("Taking off")
    }

    private inner class Engine(val name: String) {
        fun startEngine() {
            println("Engine $name started")
        }
    }
}