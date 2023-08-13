fun main(args: Array<String>) {
    val engineer = Engineer()
    val doctor = Doctor()

    engineer.name = "Engineer"
    doctor.name = "Doctor"

    engineer.salary = 15000
    doctor.salary = 25000

    engineer.work()
    engineer.study()
    engineer.work()

    doctor.study()
    doctor.study()
    doctor.study()
    doctor.work()
    doctor.work()
}

open class Job {
    var name = "Generic Job"
    var revenue = 0
    var salary = 10000

    fun work() {
        revenue += salary
        println("$name revenue $revenue")
    }

    fun study() {
        salary += 5000
        println("$name salary $salary")
    }
}

class Engineer: Job()

class Doctor: Job()