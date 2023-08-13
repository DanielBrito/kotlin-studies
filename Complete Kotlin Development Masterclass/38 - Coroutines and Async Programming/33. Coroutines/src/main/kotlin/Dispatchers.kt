import kotlinx.coroutines.*

fun main() {
    runBlocking {
        // launch(Dispatchers.Main) {
        //     println("Main dispatcher. Thread: ${Thread.currentThread().name}")
        // }

        launch(Dispatchers.Unconfined) {
            println("Unconfined1. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined2. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO. Thread: ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext. Thread: ${Thread.currentThread().name}")
        }
    }

    // Result:
    // Unconfined1. Thread: main @coroutine#2
    // Default. Thread: DefaultDispatcher-worker-1 @coroutine#3
    // IO. Thread: DefaultDispatcher-worker-2 @coroutine#4
    // newSingleThreadContext. Thread: MyThread @coroutine#5
    // Unconfined2. Thread: kotlinx.coroutines.DefaultExecutor @coroutine#2
}