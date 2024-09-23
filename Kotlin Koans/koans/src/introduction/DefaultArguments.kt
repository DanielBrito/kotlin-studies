package introduction

class DefaultArguments {
    private fun foo(
        name: String,
        number: Int,
        toUpperCase: Boolean,
    ) = (if (toUpperCase) name.uppercase() else name) + number

    fun useFoo() =
        listOf(
            foo("a", 42, false),
            foo("b", number = 1, toUpperCase = false),
            foo("c", toUpperCase = true, number = 42),
            foo(name = "d", number = 2, toUpperCase = true),
        )
}

fun main() {
    val defaultArguments = DefaultArguments()

    println(defaultArguments.useFoo())
}
