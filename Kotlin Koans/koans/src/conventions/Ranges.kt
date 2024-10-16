package conventions

fun checkInRange(
    date: MyDate,
    first: MyDate,
    last: MyDate,
): Boolean = date in first..last

fun main() {
    val date = MyDate(2014, 5, 11)
    println(checkInRange(date, MyDate(2014, 1, 1), MyDate(2014, 12, 31))) // true
    println(checkInRange(date, MyDate(2015, 1, 1), MyDate(2015, 12, 31))) // false
}
