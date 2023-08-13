fun main(args: Array<String>) {
    val onlyEvenNumbers = arrayListOf(2, 4, 8, 7, 4, 10)
    
    for(number in onlyEvenNumbers) {
        if(number % 2 != 0)
            continue
        println("Half of $number is ${number / 2}")
    }
}