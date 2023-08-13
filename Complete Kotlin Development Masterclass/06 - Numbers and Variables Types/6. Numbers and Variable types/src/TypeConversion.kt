fun main(args: Array<String>){
    val cats = 3
    val longCats = cats.toLong()

    println(cats::class.java) // int
    println(longCats::class.java) // long
    println(longCats) // 3

    val people = 7500000000
    val fewPeople = people.toInt()

    println(people::class.java) // long    
    println(fewPeople::class.java) // int
    println(fewPeople) // -1294967296

    val dogs = 5
    val byteDogs = dogs.toByte()

    println(byteDogs::class.java) // byte

    val floatDogs = dogs.toFloat()

    println(floatDogs::class.java) // float
}