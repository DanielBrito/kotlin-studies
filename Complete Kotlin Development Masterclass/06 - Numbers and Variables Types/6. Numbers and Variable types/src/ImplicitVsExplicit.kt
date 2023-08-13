fun main(args: Array<String>){
    val cats = 3
    println(cats::class.java) // Int

    val price = 14.99
    println(price::class.java) // Double

    val dogs: Byte = 5
    println(dogs::class.java) // Byte

    val days: Short = 20000
    println(days::class.java) // Short

    val meals: Int = 3
    println(meals::class.java) // Int

    val life: Long = 42
    println(life::class.java) // Long

    val newLife = 42L
    println(newLife::class.java) // Long

    val money = 5.99
    println(money::class.java) // Double

    val moreMoney = 6.99F
    println(moreMoney::class.java) // Float
}