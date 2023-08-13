fun main(args: Array<String>) {
    println("Please enter the matrix size:")

    val input = readLine() ?: ""
    val size = input.toInt()

    for(i in 1..size) {
        for(j in 1..size) {
            when(i * j % 3) {
                0 -> print("\uD83D\uDE00\t")
                1 -> print("\uD83E\uDD28\t")
                2 -> print("\uD83D\uDE31\t")
            }
        }
        println()
    }
}