fun main(args: Array<String>) {
    val guestlist = setOf("John", "Alice", "Bob", "Carol")

    println("Please enter your name:")

    val guest = readLine() ?: ""
    
    if(guest in guestlist) {
        println("Hi $guest please come in")
    } else {
        println("Sorry you're not on the guestlist")
    }

    println("How many cats do you have?")

    val input = readLine() ?: "0"
    val cats = input.toInt()

    val howMany = if(cats == 0)
        "no cats"
    else if(cats in 1..3)
        "few cats"
    else if(cats in 4..6)
        "several cats"
    else
        "many cats"

    println("This lady has $howMany")

    val animals = arrayListOf<String>("cat", "dog")
    
    if(animals.isEmpty()) {
        println("Thank you for giving homes to all out pets")
    } else {
        println("Please come in and adopt a pet. We have $animals")
    }
}