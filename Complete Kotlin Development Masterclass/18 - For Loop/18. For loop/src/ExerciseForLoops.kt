fun main(args: Array<String>) {
    println("Please enter a year:")

    val input = readLine() ?: "2020"
    val year = input.toInt()

    val isLeapYear = year % 4 == 1 && (year % 100 != 0 || year % 400 == 0)

    for(i in 1..12) {
        val message = when(i) {
            1 -> "January has 31 days"
            2 -> if(isLeapYear) "February has 29 days" else "February has 28 days"
            3 -> "March has 31 days"
            4 -> "April has 30 days"
            5 -> "May has 31 days"
            6 -> "June has 30 days"
            7 -> "July has 31 days"
            8 -> "August has 31 days"
            9 -> "September has 30 days"
            10 -> "October has 31 days"
            11 -> "November has 30 days"
            12 -> "December has 31 days"
            else -> ""
        }

        println(message)
    }
}