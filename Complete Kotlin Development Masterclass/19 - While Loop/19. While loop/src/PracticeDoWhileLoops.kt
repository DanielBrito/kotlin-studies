fun main(args: Array<String>) {
   var finished = false

   do {
       println("Please enter a number greater than 100:")

       val input = readLine() ?: ""
       var number = input.toInt()

       if(number > 100) {
           println("Thanks")
           finished = true
       } else {
           println("$number is not greater than 100. Please try again")
       }
   } while (!finished)


    finished = false

    do {
        println("Please enter a number:")

        val input = readLine() ?: ""
        var number = input.toInt()

        var factorial = 1
        var i = 1
        
        while(i <= number) {
            factorial *= i
            i++
        }

        if(factorial < 3000000) {
            println("$number! = $factorial is smaller than 3.000.000. Please try again.")
        } else {
            println("$number! = $factorial")
            finished = true
        }
    } while (!finished)
}