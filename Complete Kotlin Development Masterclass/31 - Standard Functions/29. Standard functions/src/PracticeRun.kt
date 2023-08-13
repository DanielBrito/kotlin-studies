fun main(args: Array<String>) {
    val rest = Restaurant().run {
        standardDish = "Fish and chips"
        todaySpecial = "Fillet mignon"

        printMenu()

        this
    }

    println(rest)
}

class Restaurant {
    var standardDish = ""
    var todaySpecial = ""
    
    fun printMenu() {
        println("The standard dish is $standardDish")
        println("Today's special is $todaySpecial")
    }
}