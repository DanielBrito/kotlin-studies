import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    runBlocking {
        launch(Dispatchers.Default) {
            println("First context: $coroutineContext")

            withContext(Dispatchers.IO) {
                println("Second context: $coroutineContext")
            }

            println("Third context: $coroutineContext")
        }
    }

    // Result:
    // First context: [CoroutineId(2), "coroutine#2":StandaloneCoroutine{Active}@6391cefe, Dispatchers.Default]
    // Second context: [CoroutineId(2), "coroutine#2":DispatchedCoroutine{Active}@15f69bac, Dispatchers.IO]
    // Third context: [CoroutineId(2), "coroutine#2":StandaloneCoroutine{Active}@6391cefe, Dispatchers.Default]
}