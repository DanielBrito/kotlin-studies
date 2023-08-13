fun main(args: Array<String>) {
   val a: Short = 6
   val b: Int = 32
   val result = a * b

   println(result::class.java) // class java.lang.Integer

   val a: Long = 2864582635
   val b: Float = 13.67F
   val result = a / b

   println(result::class.java) // class java.lang.Float

    val a: Float = 234.45F
    val b = 34586.453
    val result = a*b

    println(result::class.java) // class java.lang.Double
}