fun main(args: Array<String>) {
    val calc = Calculator()

    calc.add(47.0)
    calc.mul(15.0)
    calc.div(23.0)
    calc.sub(135.7456)

    calc.reset()
    
    calc.add(23.0)
}

class Calculator {
    var total = 0.0

    fun add(a: Double) {
        total += a

        println("+ $a")
        println("= $total")
    }

    fun sub(a: Double) {
        total -= a

        println("- $a")
        println("= $total")
    }

    fun div(a: Double) {
        total /= a

        println("/ $a")
        println("= $total")
    }

    fun mul(a: Double) {
        total *= a

        println("* $a")
        println("= $total")
    }

    fun reset() {
        total = 0.0

        println("= $total")
    }
}