fun main(args: Array<String>) {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant", "giraffe")
    animals.add("panda")

    println(animals) // [lion, zebra, chimp, elephant, giraffe, panda]

    animals.remove("lion")

    println(animals) // [zebra, chimp, elephant, giraffe, panda]

    val compareAnimals = listOf("elephant", "giraffe")
    val hasAllAnimals = animals.containsAll(compareAnimals)

    println("Does the zoo have all the animals? : $hasAllAnimals") // true
}