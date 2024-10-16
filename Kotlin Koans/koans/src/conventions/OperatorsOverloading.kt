package conventions

import java.util.Calendar
import java.util.Calendar.DATE
import java.util.Calendar.MONTH
import java.util.Calendar.YEAR

enum class TimeInterval { DAY, WEEK, YEAR }

data class MyDateNewest(
    val year: Int,
    val month: Int,
    val dayOfMonth: Int,
)

class RepeatedTimeInterval(
    val timeInterval: TimeInterval,
    val number: Int,
)

fun MyDateNewest.addTimeIntervals(
    timeInterval: TimeInterval,
    amount: Int,
): MyDateNewest {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == TimeInterval.YEAR) amount else 0, month, dayOfMonth)
    var timeInMillis = c.timeInMillis
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += amount *
        when (timeInterval) {
            TimeInterval.DAY -> millisecondsInADay
            TimeInterval.WEEK -> 7 * millisecondsInADay
            TimeInterval.YEAR -> 0L
        }

    val result = Calendar.getInstance()

    result.timeInMillis = timeInMillis

    return MyDateNewest(result.get(YEAR), result.get(MONTH), result.get(DATE))
}

operator fun MyDateNewest.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)

operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

operator fun MyDateNewest.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDateNewest): MyDateNewest = today + TimeInterval.YEAR + TimeInterval.WEEK

fun task2(today: MyDateNewest): MyDateNewest = today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5

fun main() {
    val date = MyDateNewest(2021, 1, 1)

    println(task1(date)) // 2022-01-08
    println(task2(date)) // 2023-01-27
}
