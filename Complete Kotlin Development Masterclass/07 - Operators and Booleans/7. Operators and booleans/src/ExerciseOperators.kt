fun main(args: Array<String>) {
    println("Please enter the amount in your bank account: ")

    val amountInput = readLine() ?: ""
    val amount = amountInput.toDouble()
    
    val amountAfter5Years = amount * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
    
    println("After 5 years, with an interest of 5.5% per year")
    println("You will have $amountAfter5Years")
}