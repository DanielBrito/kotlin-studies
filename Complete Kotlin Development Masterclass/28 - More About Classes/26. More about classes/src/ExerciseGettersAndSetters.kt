fun main(args: Array<String>) {
    val bankAccount = BankAccount()

    bankAccount.amount = 500
    bankAccount.amount = 1000
    bankAccount.amount = 1200
    bankAccount.amount = 10000
    bankAccount.amount = 20000
}

class BankAccount {
    var interestRate = 0.0
    var amount: Int = 0
        get() = field
        set(value) {
            if(value < 1000) {
                interestRate = 1.0
            } else if(value < 10000) {
                interestRate = 0.5
            } else {
                interestRate = 0.2
            }
            
            field = value
            
            println("The client has $value and has an interest rate of $interestRate")
        }
}