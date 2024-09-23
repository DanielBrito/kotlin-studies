package introduction

fun main() {
    val question = "life, the universe, and everything"
    val answer = 42

    val tripleQuotedString =
        """
        #question = "$question"
        #answer = $answer
        """.trimMargin("#")

    println(tripleQuotedString)
}
