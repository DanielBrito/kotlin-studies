package list1

fun main() {
    print("Enter your salary: ")
    val salary = readLine()!!.toDoubleOrNull() ?: return println("Invalid value")

    val taxPercentage = 0.38 / 100
    var balance = salary - (salary * taxPercentage)
    balance = balance - (balance * taxPercentage)

    println("Balance: R$ ${String.format("%.2f", balance)}")
}
