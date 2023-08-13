fun main(args: Array<String>) {
    val animals = arrayListOf("cat", "dog", "mouse", "bear")

    for (animal in animals) {
        println("Feed the $animal")
    }

    for(i in 1..12) {
        val month = when(i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            else -> "December"
        }

        println("Month #$i is $month")
    }
}