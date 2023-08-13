fun main(args: Array<String>) {
    var animal = "crocodile"
    var action: String = ""

    when(animal) {
        "cat" -> {
            action = "pet it"
        }
        "dog" -> {
            action = "feed it"
        }
        else -> {
            action = "google it"
        }
    }

    println("When you meet a $animal you should $action")

    var result = ""
    val number = 2345

    when(number % 2) {
        0 -> result = "Number is even"
        1 -> result = "Number is odd"
    }
    
    println(result)
}