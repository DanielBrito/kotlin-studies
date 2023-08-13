fun main(args: Array<String>) {
    val myDog: Dog = Pug("Pug")
    val yourDog: Dog = BassetHound("Basset Hound")
    val hisDog: Dog = Chihuahua("Chihuahua")

    myDog.play()
    myDog.bark()
    myDog.run()

    yourDog.play()
    yourDog.bark()
    yourDog.run()

    hisDog.play()
    hisDog.bark()
    hisDog.run()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name CANNOT bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class BassetHound(val name: String): Dog(name) {
    override fun run() {
        println("A $name CANNOT run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class Chihuahua(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name can definitely bark")
    }

    override fun play() {
        println("A $name CANNOT play")
    }

}