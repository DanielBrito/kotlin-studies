package classes

fun eval(expr: ExprV2): Int =
    when (expr) {
        is NumV2 -> expr.value
        is SumV2 -> eval(expr.left) + eval(expr.right)
    }

sealed class ExprV2

class NumV2(
    val value: Int,
) : ExprV2()

class SumV2(
    val left: ExprV2,
    val right: ExprV2,
) : ExprV2()

fun main() {
    println(eval(NumV2(1)))
    println(eval(SumV2(NumV2(1), NumV2(2))))
}
