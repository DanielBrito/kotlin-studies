package conventions

import java.util.Calendar
import java.util.Calendar.DATE
import java.util.Calendar.MONTH
import java.util.Calendar.YEAR

data class MyDateNew(
    val year: Int,
    val month: Int,
    val dayOfMonth: Int,
) : Comparable<MyDateNew> {
    override fun compareTo(other: MyDateNew): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

class DateRange(
    val start: MyDateNew,
    val end: MyDateNew,
) : Iterable<MyDateNew> {
    override fun iterator(): Iterator<MyDateNew> {
        return object : Iterator<MyDateNew> {
            var current: MyDateNew = start

            override fun hasNext(): Boolean = current <= end

            override fun next(): MyDateNew {
                if (!hasNext()) throw NoSuchElementException()
                val result = current
                current = current.followingDate()
                return result
            }
        }
    }
}

operator fun MyDateNew.rangeTo(other: MyDateNew) = DateRange(this, other)

fun MyDateNew.followingDate(): MyDateNew {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)

    val millisecondsInADay = 24 * 60 * 60 * 1000L
    val timeInMillis = c.timeInMillis + millisecondsInADay
    val result = Calendar.getInstance()

    result.timeInMillis = timeInMillis

    return MyDateNew(result.get(YEAR), result.get(MONTH), result.get(DATE))
}

fun iterateOverDateRange(
    firstDate: MyDateNew,
    secondDate: MyDateNew,
    handler: (MyDateNew) -> Unit,
) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

fun main() {
    val firstDate = MyDateNew(2021, 1, 1)
    val secondDate = MyDateNew(2021, 1, 3)

    iterateOverDateRange(firstDate, secondDate) { date ->
        println(date)
    }
}
