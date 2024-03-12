package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testDepositAndCheckBalance() {
        Customer customer = new Customer("Cansu", 2000.0);
        Account account = new Account(customer);

        // Smoke test for deposit
        account.deposit(500.0);
        assertEquals(2500.0, account.checkBalance());
    }

    @Test
    public void testWithdrawAndCheckBalance() {
        Customer customer = new Customer("Irem", 3000.0);
        Account account = new Account(customer);

        // Smoke test for withdraw
        assertTrue(account.withdraw(1000.0));
        assertFalse(account.withdraw(4000.0));

        // Smoke test for checkBalance
        assertEquals(2000.0, account.checkBalance());
    }
}
