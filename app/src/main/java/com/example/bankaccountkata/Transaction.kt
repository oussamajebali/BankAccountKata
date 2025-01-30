package com.example.bankaccountkata

import java.time.LocalDateTime

class Transaction(private val amount: Double, private val balance: Double) {
    private val date: LocalDateTime = LocalDateTime.now()
    override fun toString(): String {
        return "$date | $amount | $balance"
    }
}