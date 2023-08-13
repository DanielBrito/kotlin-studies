fun main(args: Array<String>) {
   println("Input a boolean value. Is it  night time?")

   val input = readLine() ?: "true"
   val night = input.toBoolean()

   if(night) {
       println("Sleep, it's night time")
   } else {
       println("Be active, it's day time")
   }

    println("Please input the funds amount:")

    val input = readLine() ?: ""
    var clientFunds = input.toInt()
    val price = 50
    var clientProducts = 0

    if(clientFunds > price) {
        clientFunds -= price
        clientProducts += 1
        println("You have purchased $clientProducts products")
        println("You have $clientFunds funds")
    } else {
        println("You have insufficient funds to purchase the products")
    }
}