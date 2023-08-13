fun main(args: Array<String>) {
    awesomeBank(
        hashMapOf(
            Pair("Alice", 546.0), 
            Pair("Bob", 345.0), 
            Pair("Carol", 456.0)
        )
    )
}

fun awesomeBank(users: HashMap<String, Double?>) {
    fun doubleAmount(amount: Double?) = amount?.times(2)

    println(users)

    for(user in users.keys) {
        users[user] = doubleAmount(users[user])
    }

    println(users)
}