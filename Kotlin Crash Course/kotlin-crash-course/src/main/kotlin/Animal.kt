abstract class Animal(
    name: String,
    age: Int = 4
) {
    init{
        println("Hello, my name is $name! I'm $age years old!")
    }

    abstract fun makeSound()
}
