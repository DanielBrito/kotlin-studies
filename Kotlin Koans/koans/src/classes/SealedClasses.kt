package classes

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }

sealed class Expr

class Num(
    val value: Int,
) : Expr()

class Sum(
    val left: Expr,
    val right: Expr,
) : Expr()

fun main() {
    println(eval(Num(1)))
    println(eval(Sum(Num(1), Num(2))))
}
