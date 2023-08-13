fun main(args: Array<String>) {
    lateinit var networkService: String

    networkService = getNetworkService()
    
    println(networkService)
}

fun getNetworkService() = "Network service"