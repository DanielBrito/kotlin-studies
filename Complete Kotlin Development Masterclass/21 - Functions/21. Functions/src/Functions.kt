fun main(args: Array<String>) {
    for(i in 1..3) {
        sayHello()
    }

    var i = 5
    
    do {
        i--
        printAlphabet()
    } while (i > 0)
}

fun sayHello() {
    println("Hello everyone")
}

fun printAlphabet() {
    println("a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z")
}