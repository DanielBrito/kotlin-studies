fun main(args: Array<String>) {
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")

    println("Michael finished on position ${winners.indexOf("Michael") + 1}") // 3

    val requiredColors = listOf("red", "green", "blue")
    val availableColors = listOf("red", "blue")

    println("Can print: ${availableColors.containsAll(requiredColors)}") // false

    val ingredients = arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")
    ingredients[ingredients.indexOf("Mozzarella")] = "Blue Cheese"

    println(ingredients) // [Chicken, Egg, Blue Cheese, Pepper]
}