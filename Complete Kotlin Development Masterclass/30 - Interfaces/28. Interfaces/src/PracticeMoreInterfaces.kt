fun main(args: Array<String>) {
    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.eat()

    myFood = FrenchRestaurant().todaySpecial()
    myFood.eat()
}

interface Food {
    fun eat()
}

class FastFood: Food {
    override fun eat() {
        println("Fast food will feed you")
    }
}

class FrenchFood: Food {
    override fun eat() {
        println("French food will feed you AND delight you")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food {
        return FastFood()
    }
}

class FrenchRestaurant {
    fun todaySpecial(): Food {
        return FrenchFood()
    }
}