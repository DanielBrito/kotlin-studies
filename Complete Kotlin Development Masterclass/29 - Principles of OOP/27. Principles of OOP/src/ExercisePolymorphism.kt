fun main(args: Array<String>) {
    val tv = TV()

    tv.getChannel("5")
    tv.getChannel("7", true)
    tv.getChannel("3", "13:00")
}

class TV {
    fun getChannel(id: String) {
        println("Regular broadcast for channel $id")
    }

    fun getChannel(id: String, subtitles: Boolean) {
        print("Regular broadcast for channel $id ")
        
        if(subtitles)
            println("with subtitles")
        else
            println("without subtitles")
    }

    fun getChannel(id: String, time: String) {
        println("Broadcast for channel $id at $time time")
    }
}