package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testCreateAccountAndRetrieve() {
        Bank bank = new Bank();
        Customer customer = new Customer("Alice", 1000.0);

        // Smoke test for createAccount
        Account account = bank.createAccount(customer);
        assertNotNull(account);

        // Smoke test for getAccount
        Account retrievedAccount = bank.getAccount(customer);
        assertNotNull(retrievedAccount);
        assertEquals(account, retrievedAccount);
    }
}
