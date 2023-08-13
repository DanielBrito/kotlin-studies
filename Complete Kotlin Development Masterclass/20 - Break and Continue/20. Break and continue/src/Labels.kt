fun main(args: Array<String>) {
    loop@for(i in 1..10) {
        for(j in 1..10) {
            if(i % 3 == 0)
                continue@loop
            println("$i, $j")
        }
    }
}