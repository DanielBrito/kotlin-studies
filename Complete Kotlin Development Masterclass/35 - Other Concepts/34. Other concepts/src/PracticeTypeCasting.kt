import kotlin.random.Random

fun main(args: Array<String>) {
    for (i in 1..10) {
        println("$i.")

        val service = getNetworkService()
        
        (service as? FTPService)?.transferFile()
    }
}

open class NetworkService {}

class FTPService: NetworkService() {
    fun transferFile() {
        println("Transferring a file via FTP")
    }
}

fun getNetworkService(): NetworkService {
    val value = Random.nextInt()
    
    return if(value % 2 == 0) NetworkService() else FTPService()
}