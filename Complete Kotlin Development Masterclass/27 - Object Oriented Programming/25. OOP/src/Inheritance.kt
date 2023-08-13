fun main(args: Array<String>) {
    val myDoggy = Corgi()

    myDoggy.size = 10

    println(myDoggy.size)

    myDoggy.bark()
    myDoggy.play()
}

open class Dog {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi: Dog()