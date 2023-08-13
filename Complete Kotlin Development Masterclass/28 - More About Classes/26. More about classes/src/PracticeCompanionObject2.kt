import kotlin.random.Random

fun main(args: Array<String>) {
    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)

    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()

    myLock.unlock(randomKey)
}

class Lock(key: Key) {
    val secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    fun generateSecret(): String{
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key) {
        if(key.secretCode == secretCode) {
            println("Lock is open")
        } else {
            println("Key is not correct")
        }
    }
}

class Key {
    var secretCode: String = ""

    set(value) {
        if(field == "")
            field = value
    }
}