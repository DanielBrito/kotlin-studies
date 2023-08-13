fun main(args: Array<String>) {
    println("Please enter a number:")

    val input = readLine() ?: "0"
    val number = input.toInt()
    val outcome = if(number / 10 == 0) "Single digit number" else "Multiple digit number"
    
    println(outcome)

    val response = 704

    val message = if(response/100 == 1) {
        "Information response"
    } else if (response/100 == 2) {
        "Success"
    } else if (response/100 == 3) {
        "Redirect"
    } else if (response/100 == 4) {
        "Client error"
    } else {
        "Server error"
    }

    println(message) // Server error
}