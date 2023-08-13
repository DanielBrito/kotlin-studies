fun main(args: Array<String>) {
    println("Please enter an animal:")
    val animal = readLine() ?: ""

    val lifespan = getLifespan(animal)
    
    println("A $animal has a lifespan of $lifespan years")
}

fun getLifespan(name: String): Int {
    val lifespan = when(name) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }

    return lifespan
}