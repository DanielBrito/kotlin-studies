fun main(args: Array<String>) {
    val matrixSize = 9

    for(i in 0..matrixSize) {
        for(j in 0..matrixSize) {
            if(i==j) {
                print("diagonal\t")
            } else {
                print("$i,$j  \t\t")
            }
        }
        
        println()
    }
}