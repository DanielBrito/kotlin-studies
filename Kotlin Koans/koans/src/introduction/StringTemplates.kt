package introduction

class StringTemplates {
    private val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    fun getPattern(): String = """\d{2} $month \d{4}"""
}

fun main() {
    val stringTemplates = StringTemplates()

    println(stringTemplates.getPattern())
}
