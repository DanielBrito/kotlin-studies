fun main(args: Array<String>){
    println("Please enter a number:")
    val numberInput = readLine() ?: "0"

    val myByte = numberInput.toByte()
    println(myByte)
    println(myByte::class.java)

    val myShort = myByte.toShort()
    println(myShort::class.java)

    val myInt = numberInput.toInt()
    println(myInt::class.java)

    val myLong = numberInput.toLong()
    println(myLong::class.java)

    val myFloat = numberInput.toFloat()
    println(myFloat::class.java)

    val myDouble = numberInput.toDouble()
    println(myDouble::class.java)

    val pi = 3.14159
    println("$pi is a ${pi::class.java}")

    val piFloat = pi.toFloat()
    println("$piFloat is a ${piFloat::class.java}")

    val piInt = pi.toInt() // 3
    println("$piInt is a ${piInt::class.java}")

    val piString = pi.toString()
    println("$piString is a ${piString::class.java}")
}