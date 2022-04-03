import kotlin.random.Random

fun main() {
    variablesAndTypes()
    arithmeticOperators()
    logicalComparisonOperators()
    strings()
    conditionals()
    nullValues()
    lists()
    loops()
    whenExpression()
    functions()
    classes()
    anonymousClass()
    exceptions()
    lambdaFunctions()
}

fun variablesAndTypes() {
    var x: Int = 3
    println("The value of x is $x")

    x = 4
    println("The value of x is now $x")

    val y: Int = 10
    println("The constant value of y is $y")

    val wholeNumber = 3
    val bigNumber = 3L
    val preciseDecimal = 3.33
    val decimal = 3.33f

    val iLoveVegetables = true
    val iEatMeat = false

    val iAmALetter = 'd'

    println("-------------------------------------------")
}

fun arithmeticOperators() {
    val sum = 4 + 3
    val minus = 4 - 3
    val multiplication = 4 * 3
    val integerDivision = 4 / 3
    val decimalDivision = 4f / 3f
    val remainder = 10 % 3

    println("The value of sum is $sum")
    println("The value of minus is $minus")
    println("The value of multiplication is $multiplication")
    println("The value of integerDivision is $integerDivision")
    println("The value of decimalDivision is $decimalDivision")
    println("The value of remainder is $remainder")

    println("-------------------------------------------")
}

fun logicalComparisonOperators() {
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAdultAndProgrammer = amIAnAdult && amIAProgrammer
    val amIAdultOrProgrammer = amIAnAdult || amIAProgrammer
    val isAdultEqualProgrammer = (amIAnAdult == amIAProgrammer)
    val isAdultDiffProgrammer = (amIAnAdult != amIAProgrammer)
    val iAmNotAnAdult = !amIAnAdult

    println("Am I an adult programmer? $amIAdultAndProgrammer")

    println("-------------------------------------------")
}

fun strings() {
    val str = "Hello, Kotlin"

    println(str)
    println(str.uppercase())

    println("-------------------------------------------")
}

fun conditionals() {
    val x = 1 + 1

    if (x == 2) {
        println("x is 2")
    } else if (x == 3) {
        println("x is 3")
    } else {
        println("x is not 2 or 3")
    }

    val y = if (x == 2) 2 else 3

    println("The value of y is $y")

    println("-------------------------------------------")
}

fun nullValues() {
    println("Enter the first value: ")
    val number1 = readLine() ?: "0"

    println("Enter the second value: ")
    val number2 = readLine() ?: "0"

    val result = number1.toInt() + number2.toInt()

    println("$number1 + $number2 = $result")

    println("-------------------------------------------")
}

fun lists() {
    val shoppingList = listOf("MacBook", "Home gym", "Bicycle")
    val bookList = mutableListOf("Clean Code", "Clean Architecture")

    bookList.add("Clean Coder")

    println(shoppingList)
    println(bookList)

    println("-------------------------------------------")
}

fun loops() {
    val techStack = listOf("ReactJS", "NodeJS", "React Native")
    var counter = 0

    println("While loop:")

    while (counter < techStack.size) {
        println(techStack[counter])
        counter++
    }

    println("For loop:")

    for (techItem in techStack) {
        println(techItem)
    }

    println("For range:")

    for (i in 1..5) {
        println(i)
    }

    println("-------------------------------------------")
}

fun whenExpression() {
    val x = Random.nextInt(0, 10)

    when (x) {
        in 1..2 -> println("$x is between 1 and 2")
        in 3..10 -> println("$x is between 3 and 10")
        else -> {
            println("$x is not in the range of 1 to 10")
        }
    }

    println("-------------------------------------------")
}

fun functions() {
    fun printNumbers(upperBound: Int = 10) {
        for (i in 1..upperBound) {
            println(i)
        }
    }

    printNumbers()
    printNumbers(5)
    printNumbers(upperBound = 3)

    fun isEven(number: Int): Boolean = number % 2 == 0

    for (i in 1..5) {
        if (isEven(i)) println("$i is even")
        else println("$i is odd")
    }

    fun Int.isOdd(): Boolean = this % 2 == 1

    for (i in 1..5) {
        if (i.isOdd()) println("$i is odd")
        else println("$i is even")
    }

    println("-------------------------------------------")
}

fun classes() {
    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()
}

fun anonymousClass() {
    val bear = object : Animal("Bear") {
        override fun makeSound() {
            println("Roar!")
        }
    }

    bear.makeSound()

    println("-------------------------------------------")
}

fun exceptions() {
    println("Enter an integer:")
    val number = readLine() ?: "0"

    try {
        val parsedNumber = number.toInt()
        println("Entered number: $parsedNumber")
    } catch (e: Exception) {
        println("Invalid value -> ${e.message}")
    }

    println("-------------------------------------------")
}

fun lambdaFunctions() {
    val list = listOf("Kotlin", "is", "very", "fun")

    val counterDefault = list.count { currentStr ->
        currentStr.length == 3
    }

    println("$counterDefault values with 3 characters")

    val counterCustom = list.customCount { it.length >= 4 }

    println("$counterCustom values with 4 or more characters")

    val values = listOf(1, 2, 3, 4, 5)

    val counterGreater = values.customCountGenerics { it > 2 }

    println("$counterGreater values are greater than 2")
}

fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0

    for (string in this) {
        if (function(string)) {
            counter++
        }
    }

    return counter
}

fun <T> List<T>.customCountGenerics(function: (T) -> Boolean): Int {
    var counter = 0

    for (string in this) {
        if (function(string)) {
            counter++
        }
    }

    return counter
}
