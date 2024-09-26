package classes

data class Person(
    val name: String,
    val age: Int,
)

fun getPeople(): List<Person> = listOf(Person("Alice", 29), Person("Bob", 31))

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2
}

fun main() {
    val people = getPeople()

    for (person in people) {
        println("${person.name} is ${person.age} years old")
    }

    println(comparePeople())
}
