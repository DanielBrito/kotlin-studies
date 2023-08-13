fun main(args: Array<String>) {
    val me = Son()

    me.printName()
}

open class Father {
    open val firstName = "John"
    val lastName = "Smith"

    open fun printName() {
        println("My name is $firstName $lastName")
    }
}

class Son: Father() {
    override val firstName = "Michael"

    override fun printName() {
        super.printName()
        
        println("My father's name is ${super.firstName} ${super.lastName}")
    }
}