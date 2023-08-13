fun main(args: Array<String>) {
    val puzzlePieces = 20
    var piecesPlaced = 0
    
    do {
        piecesPlaced++
        println("Placed piece #$piecesPlaced")
    } while (piecesPlaced < puzzlePieces)
}