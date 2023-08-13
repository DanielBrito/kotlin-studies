fun main(args: Array<String>) {
    val daughter = MyDaughter()
    
    daughter.say("hi")

    val mom = MyMom()
    
    mom.say("hi")
    mom.say()
    mom.say(4)
    mom.say("hello daughter", 2)
}

open class MyMom {
    open fun say(message: String) {
        println("Mom says $message")
    }

    fun say(times: Int) {
        for(i in 1..times) {
            println("Mom says hello")
        }
    }

    fun say() {
        println("Mom says hi how are you")
    }

    fun say(message: String, times: Int) {
        for(i in 1..times) {
            println("Mom says $message")
        }
    }
}

class MyDaughter: MyMom() {
    override fun say(message: String) {
        println("Daughter says $message")
    }
}