import kotlin.random.Random

fun main(args: Array<String>) {
    val animals = getAnimals()

    animals.forEach { animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}

abstract class Animal

class Dog : Animal() {
    fun bark() {
        println("Dog is barking")
    }
}

class Cat : Animal() {
    fun purr() {
        println("Cat is purring")
    }
}

fun getAnimals(): ArrayList<Animal> {
    val animals = arrayListOf<Animal>()

    for (i in 1..20) {
        animals.add(
            if (Random.nextInt() % 2 == 0) Dog() else Cat()
        )
    }

    return animals
}