package conventions

data class MyDate(
    val year: Int,
    val month: Int,
    val dayOfMonth: Int,
) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) =
        when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
}

fun test(
    date1: MyDate,
    date2: MyDate,
) {
    println(date1 < date2)
}

fun main() {
    test(MyDate(2014, 5, 10), MyDate(2014, 5, 11)) // true
    test(MyDate(2014, 5, 10), MyDate(2014, 1, 11)) // false
}
