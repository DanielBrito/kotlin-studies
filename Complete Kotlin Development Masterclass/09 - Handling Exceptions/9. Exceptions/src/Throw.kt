import java.lang.IllegalStateException

fun main(args: Array<String>) {
    var test = readLine()
    
    throw IllegalStateException("I don't like this input")
}