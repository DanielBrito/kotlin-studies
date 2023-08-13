import java.lang.Exception

fun main(args: Array<String>) {
    val test = readLine()
     
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("An exception happened: ${e.localizedMessage}")
        e.printStackTrace()
    }
}