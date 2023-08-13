fun main(args: Array<String>) {
    val myUser = User("John", "john@gmail.com", "johnIsCool")

    println(myUser.toString())

    val myUser2 = User("John", "john@gmail.com", "johnIsCool")

    println(myUser == myUser2) // true
    println(myUser.equals(myUser2)) // true

    val myUser3 = myUser2.copy(email = "john1@gmail.com")

    println(myUser3)

    println(myUser2.equals(myUser3)) // false
}

data class User(
    val name: String,
    val email: String,
    val password: String
)