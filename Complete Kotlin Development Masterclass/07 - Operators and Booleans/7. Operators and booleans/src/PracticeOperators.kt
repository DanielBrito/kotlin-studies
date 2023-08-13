fun main(args: Array<String>) {
    // First exercise
    var a = 76.254
    var b = 3.867

    println("Addition: ${a+b}")
    println("Subtraction: ${a-b}")
    println("Multiplication: ${a*b}")
    println("Division: ${a/b}")
    println("Remainder: ${a%b}")

    // Second exercise
    val kiloPrice = 29.99
    val purchaseAmount = 1F/3

    println("Your total is ${kiloPrice * purchaseAmount}")

    // Third exercise
    println("Please enter the amount in your bank account:")

    val amountInput = readLine() ?: ""
    val amount = amountInput.toDouble()

    println("Congratulations, you now have ${amount * 3}")
}