fun main(args: Array<String>) {
    val cat = Animal()

    cat.run() // Animal's top speed is 0

    cat.name = "Cat"
    cat.topSpeed = 40

    cat.run() // Cat's top speed is 40
}

class Animal {
    var name = "Animal"
    var topSpeed = 0

    fun run() {
        println("$name's top speed is $topSpeed")
    }
}