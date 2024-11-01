package properties

class LazyPropertyNew(
    val initializer: () -> Int,
) {
    val lazyValue: Int by lazy(initializer)
}

fun main() {
    val lazyProperty = LazyPropertyNew { 10 }

    println(lazyProperty.lazyValue) // 10
    println(lazyProperty.lazyValue) // 10
}
