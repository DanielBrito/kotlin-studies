fun main(args: Array<String>) {
    Lock().unlock(
        Key().apply {
            secretCode = "123"
            carve()
        }
    )
}

class Lock {
    fun unlock(key: Key) {
        println("Unlocked lock with key $key")
    }
}

class Key {
    var secretCode = ""
    
    fun carve() {
        println("Carving the key with code $secretCode")
    }
}