package list1

import java.time.LocalDate

fun main() {
    print("Enter your birth year: ")
    val birthYear = readLine()!!.toIntOrNull() ?: return println("Invalid year")

    print("Enter the current year: ")
    val currentYear = readLine()!!.toIntOrNull() ?: return println("Invalid year")
    // val currentYear = LocalDate.now().year /* Built in version */

    val age = currentYear - birthYear
    val ageIn2050 = age + (2050 - currentYear)

    println("Your age is $age YO")
    println("Your age in 2050 will be $ageIn2050 YO")
}
