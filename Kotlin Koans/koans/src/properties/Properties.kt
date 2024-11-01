package properties

class PropertyExample {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value) {
            field = value
            counter++
        }
}

fun main() {
    val propertyExample = PropertyExample()

    propertyExample.propertyWithCounter = 10
    propertyExample.propertyWithCounter = 20

    println(propertyExample.counter) // 2
}
