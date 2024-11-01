package properties

import java.util.Calendar
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {
    var timeInMillis: Long? = null

    override fun getValue(
        thisRef: R,
        property: KProperty<*>,
    ): MyDate = timeInMillis!!.toDate()

    override fun setValue(
        thisRef: R,
        property: KProperty<*>,
        value: MyDate,
    ) {
        timeInMillis = value.toMillis()
    }
}

data class MyDate(
    val year: Int,
    val month: Int,
    val dayOfMonth: Int,
)

fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    return c.getTimeInMillis()
}

fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.setTimeInMillis(this)
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}

fun main() {
    val d = D()

    d.date = MyDate(2021, 1, 1)

    println(d.date)
}
