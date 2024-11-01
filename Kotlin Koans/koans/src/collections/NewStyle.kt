package collections

fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> s.length }

    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.maxOrNull()

    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}

fun main() {
    val collection =
        listOf(
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "ab",
            "bc",
            "cd",
            "de",
            "ef",
            "abc",
            "bcd",
            "cde",
            "def",
            "abcd",
            "bcde",
            "cdef",
            "abcde",
            "bcdef",
            "abcdef",
        )

    val result = doSomethingWithCollection(collection)

    println(result)
}
