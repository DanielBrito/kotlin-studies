fun main(args: Array<String>) {
    val myCountry = Country().apply { setName("Sweden") }
    
    println("Hello ${myCountry.getName()}!")
}

class Country {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name
}