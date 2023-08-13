fun main(args: Array<String>) {
    val value = "Testing my strings"

    if(value is String) {
        println("This string has ${value.length} characters")
    }

    val myCar: Car = getCar()

    if(myCar !is BMW) {
        println("This is not my favourite brand")
    }

    if(myCar is BMW) {
        // (myCar as BMW).drive()
        myCar.drive()
    }

    val bmwCar = myCar as? BMW
    
    bmwCar?.drive()
}

open class Car {}

class BMW: Car() {
    fun drive() {
        println("Driving my BMW")
    }
}

fun getCar(): Car = BMW()