fun main(args: Array<String>) {
    val person = Person()

    with(person) {
        firstName = "John"
        lastName = "Smith"
        age = 32
        
        printPersonInfo()
    }
}

class Person {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun printPersonInfo() {
        println("$firstName $lastName is $age years old")
    }
}