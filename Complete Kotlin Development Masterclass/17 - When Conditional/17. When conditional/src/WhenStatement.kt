fun main(args: Array<String>) {
    val animal = "dog"

    val action = when(animal) {
        "cat" -> {
            "feed it"
        }
        "dog" -> {
            println("Yey I met a dog!")
            "pet it"
        }
        else -> "google it"
    }

    println("When you meet a $animal you should $action")

    val month = "February"
    val monthsWith31Days = listOf("January", "March", "May", "July", "August", "October", "December")

    val days = when(month) {
        in monthsWith31Days -> 31
        "February" -> 28
        else -> 30
    }

    println("The month of $month has $days days")
}