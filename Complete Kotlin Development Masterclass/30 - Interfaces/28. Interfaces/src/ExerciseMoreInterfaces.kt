fun main(args: Array<String>) {
    val dealer = CarDealer()
    var myCar = dealer.rentAffordableCar()

    myCar.rent()

    myCar = dealer.rentLuxuryCar()

    myCar.rent()
}

interface RentalCar {
    var price: Int

    fun rent()
}

class AffordableCar: RentalCar {
    override var price: Int = 1000

    override fun rent() {
        println("The affordable car costs 1000")
    }
}

class LuxuryCar: RentalCar {
    override var price: Int = 5000
    
    override fun rent() {
        println("The luxury car costs 5000")
    }
}

class CarDealer {
    fun rentAffordableCar(): RentalCar {
        return AffordableCar()
    }
    fun rentLuxuryCar(): RentalCar {
        return LuxuryCar()
    }
}