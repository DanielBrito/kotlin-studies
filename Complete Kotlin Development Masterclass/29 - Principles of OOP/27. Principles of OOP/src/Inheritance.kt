fun main(args: Array<String>) {
    val carol = Daughter("French")

    println(carol.hairColor) // blonde

    carol.say("Hi")
}

open class Mom(nativeTongue: String) {
    open val hairColor = "brown"
    val eyeColor = "blue"

    open fun say(message: String) {
        println("Mom says $message")
    }
}

class Daughter(nativeTongue: String): Mom(nativeTongue) {
    override val hairColor = "blonde"

    override fun say(message: String) {
        println("Daughter says $message")

        super.say(message)

        println("Mother has ${super.hairColor} hair color")
    }
}