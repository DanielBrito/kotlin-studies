package introduction

fun sendMessageToClient(
    client: Client?,
    message: String?,
    mailer: Mailer,
) {
    val email = client?.personalInfo?.email

    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(
    val personalInfo: PersonalInfo?,
)

class PersonalInfo(
    val email: String?,
)

interface Mailer {
    fun sendMessage(
        email: String,
        message: String,
    )
}

fun main() {
    val mailer =
        object : Mailer {
            override fun sendMessage(
                email: String,
                message: String,
            ) {
                println("Sending message to $email: $message")
            }
        }

    sendMessageToClient(
        client =
            Client(
                PersonalInfo("daniel@email.com"),
            ),
        message = "Hello, Daniel!",
        mailer = mailer,
    )
}
