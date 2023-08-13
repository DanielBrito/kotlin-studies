fun main(args: Array<String>) {
    val clients = arrayListOf("Michael", "Jane", "Dan", "Michelle")
    val messages = getMessages(clients) { name -> "Hello, $name! How are you?" }
    
    println(clients)
    println(messages)

    for(i in 0..clients.size-1) {
        println("Message for ${clients[i]}")
        println(messages[i])
        println()
    }
}

fun getMessages(clients: Collection<String>, getMessage: (String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()

    for (client in clients) {
        messages.add(getMessage(client))
    }

    return messages
}