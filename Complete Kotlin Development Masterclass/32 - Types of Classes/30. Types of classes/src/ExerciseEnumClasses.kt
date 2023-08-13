fun main(args: Array<String>) {
    val olympics = Olympics()

    println(olympics.getMedal(2)) // SILVER
    println(olympics.getMedal(7)) // NONE
    println(olympics.getPosition(Medal.GOLD)) // 1
    println(olympics.getPosition(Medal.BRONZE)) // 3
}

enum class Medal(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics {
    fun getMedal(position: Int): Medal {
        return when(position) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }

    fun getPosition(medal: Medal) = medal.position
}