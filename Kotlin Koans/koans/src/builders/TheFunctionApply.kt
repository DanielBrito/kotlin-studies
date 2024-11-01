package builders

fun <T> T.myApply(f: T.() -> Unit): T {
    f()
    return this
}

fun createString(): String =
    StringBuilder()
        .myApply {
            append("Numbers: ")
            for (i in 1..10) {
                append(i)
            }
        }.toString()

fun createMap(): Map<Int, String> =
    hashMapOf<Int, String>().myApply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
