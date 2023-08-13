fun main(args: Array<String>) {
    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true

    if(petStore.contains("cat")) {
        if(hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Buy cat only")
        }
    } else {
        println("Ask the pet store owner to get a cat")
    }
}