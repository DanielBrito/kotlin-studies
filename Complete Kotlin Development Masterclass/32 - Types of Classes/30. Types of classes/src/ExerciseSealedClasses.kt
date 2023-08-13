import kotlin.random.Random

fun main(args: Array<String>) {
    for(i in 1..10) {
        val prize = lottery()

        when (prize) {
            is Vacation -> println("I'm going on holiday!")
            is Car -> println("Wow I won a car!")
            is GiftCard -> println("Yay, a gift card")
        }
    }
}

fun lottery(): Prize {
    val number = Random.nextInt(3)

    return when(number) {
        0 -> FranceHoliday()
        1 -> VW()
        else -> Dollar10()
    }
}

sealed class Prize

sealed class Car: Prize()

sealed class Vacation: Prize()

sealed class GiftCard: Prize()

class VW: Car()

class FranceHoliday: Vacation()

class Dollar10: GiftCard()