package org.example;

/**
 * Customer class represents a bank customer.
 */
public class Customer {
    private String name;
    private double initialDeposit;

    /**
     * Constructor to create a new customer.
     * @param name The name of the customer.
     * @param initialDeposit The initial deposit amount.
     */
    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.initialDeposit = initialDeposit;
    }

    /**
     * Gets the name of the customer.
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the initial deposit amount of the customer.
     * @return The initial deposit amount.
     */
    public double getInitialDeposit() {
        return initialDeposit;
    }
}
