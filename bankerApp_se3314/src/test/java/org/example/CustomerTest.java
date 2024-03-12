package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testGetName() {
        Customer customer = new Customer("David", 1500.0);

        // Smoke test for getName
        assertEquals("David", customer.getName());
    }

    @Test
    public void testGetInitialDeposit() {
        Customer customer = new Customer("Eve", 1000.0);

        // Smoke test for getInitialDeposit
        assertEquals(1000.0, customer.getInitialDeposit());
    }
}
