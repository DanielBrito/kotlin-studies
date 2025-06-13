package list1

fun main() {
    val bonusPercentage = 0.05
    val taxPercentage = 0.07

    print("Enter the gross salary: ")
    val grossSalary = readLine()!!.toDoubleOrNull() ?: return println("Invalid salary")

    val bonus = grossSalary * bonusPercentage
    val tax = grossSalary * taxPercentage
    val netSalary = grossSalary + bonus - tax

    println("Bonus: R$ ${String.format("%.2f", bonus)}")
    println("Tax: R$ ${String.format("%.2f", tax)}")
    println("Net salary: R$ ${String.format("%.2f", netSalary)}")
}
