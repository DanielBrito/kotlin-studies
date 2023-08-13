fun main(args: Array<String>) {
    val myParakeet = Parakeet()

    myParakeet.fly()
}

open class Bird {
    open val color = "grey"
    open val speed = 50

    open fun fly() {
        println("A $color bird can fly up to $speed kph")
    }
}

class Parakeet: Bird() {
    override val color = "green"
    override val speed = 65

    override fun fly() {
        super.fly()
        
        println("A ${super.color} bird can fly up to ${super.speed} kph")
    }
}