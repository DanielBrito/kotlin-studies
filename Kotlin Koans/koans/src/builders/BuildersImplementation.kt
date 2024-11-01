package builders

open class TagNew(
    val name: String,
) {
    protected val children = mutableListOf<TagNew>()

    override fun toString() = "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit): TABLE {
    val table = TABLE()
    table.init()
    return table
}

class TABLE : TagNew("table") {
    fun tr(init: TRNew.() -> Unit) {
        val tr = TRNew()
        tr.init()
        children += tr
    }
}

class TRNew : TagNew("tr") {
    fun td(init: TDNew.() -> Unit) {
        children += TDNew().apply(init)
    }
}

class TDNew : TagNew("td")

fun createTable() =
    table {
        tr {
            repeat(2) {
                td {
                }
            }
        }
    }

fun main() {
    println(createTable())
}
