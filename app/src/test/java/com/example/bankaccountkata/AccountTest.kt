package com.example.bankaccountkata

import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class AccountTest {

    @Test
    fun `deposit increases transaction count`() {
        val account = Account()
        account.deposit(1000.0)
        assertEquals(1, account.getTransactions().size)
    }

    @Test
    fun `withdraw records a transaction`() {
        val account = Account()
        account.deposit(1000.0)
        account.withdraw(500.0)
        assertEquals(2, account.getTransactions().size)
    }

    @Test
    fun `withdraw exceeding balance throws exception`() {
        val account = Account()
        account.deposit(500.0)
        assertThrows(IllegalArgumentException::class.java) { account.withdraw(1000.0) }
    }
}