import kotlin.random.Random

fun main(args: Array<String>) {
    println(Random.nextInt()) // 0..Int.MAX_VALUE
    println(Random.nextInt(10)) // 0..10
    println(Random.nextInt(20, 30)) // 20..30
    println(Random.nextDouble(300.0)) // 0.0..300.0
}