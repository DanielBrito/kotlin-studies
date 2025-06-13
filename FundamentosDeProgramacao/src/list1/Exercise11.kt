package list1

fun main() {
    print("Enter the number of working hours: ")
    val workingHours = readLine()!!.toIntOrNull() ?: return println("Invalid value")

    print("Enter the current minimum wage: ")
    val minimumWage = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    val hourPrice = minimumWage / 2
    val grossSalary = hourPrice * workingHours
    val taxPercentage = 3.0 / 100.0
    val taxDiscount = grossSalary * taxPercentage
    val netSalary = grossSalary - taxDiscount

    println("Net salary: R$ ${String.format("%.2f", netSalary)}")
}
