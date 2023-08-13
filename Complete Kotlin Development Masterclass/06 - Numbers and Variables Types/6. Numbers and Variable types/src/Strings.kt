fun main(args: Array<String>){
    val cats = 3
    println(cats::class.java) // class java.lang.Integer

    val catsString = cats.toString()
    println(catsString::class.java) // class java.lang.String

    val pi = 3.1415
    println(pi::class.java) // class java.lang.Double

    val piString = pi.toString()
    println(piString::class.java) // class java.lang.String
}