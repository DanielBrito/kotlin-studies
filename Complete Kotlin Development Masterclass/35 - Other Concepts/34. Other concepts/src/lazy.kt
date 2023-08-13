import kotlin.random.Random

fun main(args: Array<String>) {
    val someLargeVariable: String by lazy {
        "Some large value"
    }

    if(Random.nextInt() % 2 == 0) {
        println(someLargeVariable)
    }
}