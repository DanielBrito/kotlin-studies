package introduction

class NamedArguments {
    fun joinOptions(options: Collection<String>) =
        options.joinToString(
            prefix = "[",
            postfix = "]",
            separator = ", ",
        )
}

fun main() {
    val namedArguments = NamedArguments()

    println(namedArguments.joinOptions(listOf("a", "b", "c")))
}
