package com.example.bankaccountkata

class Account {
    private var balance: Double = 0.0
    private val transactions: MutableList<Transaction> = mutableListOf()

    fun deposit(amount: Double) {
        require(amount > 0) { "Deposit must be positive" }
        balance += amount
        transactions.add(Transaction(amount, balance))
    }

    fun withdraw(amount: Double) {
        require(amount > 0) { "Withdrawal must be positive" }
        require(amount <= balance) { "Insufficient balance" }
        balance -= amount
        transactions.add(Transaction(-amount, balance))
    }

    fun printStatement() {
        println("Date | Amount | Balance")
        transactions.forEach { println(it) }
    }

    fun getTransactions(): List<Transaction> = transactions
}

fun main() {
    val account = Account()
    account.deposit(1000.0)
    account.withdraw(500.0)
    account.printStatement()
}