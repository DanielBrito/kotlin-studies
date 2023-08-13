fun main(args: Array<String>) {
    val myPet = "Crocodile"
    println(myPet.length) // 9

    val myName = "michelle"
    println(myName.capitalize()) // Michelle

    val myAnimal = "Giraffe"
    println(myAnimal.decapitalize()) // giraffe

    val myText = "    there are too many spaces       "
    println(myText.trim()) // there are too many spaces

    println(myPet.get(3)) // c
    println(myPet[3]) // c
    println(myPet.substring(3)) // codile
    println(myPet.substring(3, 6)) // cod
}