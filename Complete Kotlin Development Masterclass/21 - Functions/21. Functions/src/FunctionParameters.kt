fun main(args: Array<String>) {
   double(5)

   for(i in 1..10) {
       double(i)
   }

   val people = listOf("Anna", "Bob", "Carol")
   
   sayHelloToPeople(people)

    doubleMessage(5, "5 * 2 = ")
    doubleMessage(8)
}

fun double(number: Int) {
    println("Double $number is ${number * 2}")
}

fun sayHelloToPeople(people: Collection<String>) {
    for(person in people) {
        println("Hello $person")
    }
}

fun doubleMessage(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}