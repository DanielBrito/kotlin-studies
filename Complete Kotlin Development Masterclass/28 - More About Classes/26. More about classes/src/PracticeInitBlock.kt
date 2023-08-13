fun main(args: Array<String>) {
    val newLaptop = Laptop("Windows 10")
}

class Laptop(val operatingSystem: String) {
    init {
        println("Operating system $operatingSystem is installing")
    }
}