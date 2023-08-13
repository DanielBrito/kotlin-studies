fun main(args: Array<String>) {
    val myCoffeeShop = CoffeeShop()
    var myCoffee: Coffee? = null

    for(i in 1..5) {
        myCoffee = myCoffeeShop.purchaseCoffee()
        myCoffee.wakeUp()
        myCoffee.quenchThirst()
    }
}

interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}

class Arabica: Coffee {
    override fun wakeUp() {
        println("Waking you up with some Arabica")
    }

    override fun quenchThirst() {
        println("Quenching your Arabica thirst")
    }
}

class Robusta: Coffee {
    override fun wakeUp() {
        println("Robusta will wake you up")
    }

    override fun quenchThirst() {
        println("Robusta will quench your thirst for coffee")
    }
}

class CoffeeShop {
    fun purchaseCoffee(): Coffee {
        val randomNumber = System.currentTimeMillis()

        return if(randomNumber % 2 == 0L) Arabica() else Robusta()
    }
}