fun main(args: Array<String>) {
    listAnimals()
    // listOneAnimal("dog")
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    val animals = listOf("cat", "dog", "giraffe")
    
    for(animal in animals) {
        listOneAnimal(animal)
    }
}