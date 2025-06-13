package list1

fun main() {
    print("Enter the factory price: ")
    val factoryPrice = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    print("Enter the distributor percentage profit: ")
    val distributorPercentageProfit = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    print("Enter the tax percentage: ")
    val taxPercentage = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    val distributorProfit = factoryPrice * (distributorPercentageProfit / 100)
    val taxAmount = factoryPrice * (taxPercentage / 100)
    val vehiclePrice = factoryPrice + distributorProfit + taxAmount

    println("The vehicle costs: R$ ${String.format("%.2f", vehiclePrice)}")
}
