fun main(args: Array<String>) {
    val usernames = hashSetOf("john", "bob", "alice")
    var finished = false

    do {
        println("Please choose your username:")
        val input = readLine() ?: ""

        if(usernames.contains(input)) {
            println("$input is taken. Please try again")
        } else {
            println("$input is your new username")
            finished = true
            usernames.add(input)
        }
    }while (!finished)
    
    println(usernames)
}