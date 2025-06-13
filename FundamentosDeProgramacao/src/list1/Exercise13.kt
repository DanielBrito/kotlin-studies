package list1

fun main() {
    print("Enter the minimum wage: ")
    val minimumWage = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    print("Enter the kilowatts consumed: ")
    val kilowattsConsumed = readLine()!!.toIntOrNull() ?: return println("Invalid value")

    val kilowattPrice = minimumWage / 5
    val valueToBePaid = kilowattPrice * kilowattsConsumed
    val discountPercentage = 15.0 / 100.0
    val valueToBePaidWithDiscount = valueToBePaid * (1 - discountPercentage)

    println("Kilowatt price: R$ ${format(kilowattPrice)}")
    println("Value to be paid: R$ ${format(valueToBePaid)}")
    println("Value to be paid with discount: R$ ${format(valueToBePaidWithDiscount)}")
}

private fun format(value: Double) = String.format("%.2f", value)
