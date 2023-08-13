fun main(args: Array<String>) {
    val favouritePet = "dog"
    val availablePets = listOf("dog", "cat", "horse")

    if(favouritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePet is not available")
    }

    println("Enter your preferred coffee:")

    val coffee = readLine() ?: ""
    val availableCoffee = listOf("capuccino", "mocha")
    
    if(coffee !in availableCoffee)
        println("Sorry we don't have your coffee")
    else
        println("$coffee is available")

    println("Please enter a number:")

    val input = readLine() ?: "0"
    val number = input.toInt()
    
    if(number !in 0..9)
        println("Your number is not single digit")
}