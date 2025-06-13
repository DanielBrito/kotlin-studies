package list1

fun main() {
    print("Enter the current salary: ")
    val currentSalary = readLine()!!.toDoubleOrNull() ?: return println("Invalid salary")

    print("Enter the increase percentage: ")
    val increasePercentage = readLine()!!.toDoubleOrNull() ?: return println("Invalid percentage")

    val increaseAmount = currentSalary * (increasePercentage / 100)
    val newSalary = currentSalary + increaseAmount

    println("Increase amount: R$ ${String.format("%.2f", increaseAmount)}")
    println("New salary: R$ ${String.format("%.2f", newSalary)}")
}
