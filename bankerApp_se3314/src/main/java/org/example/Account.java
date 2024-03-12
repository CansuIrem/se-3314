package org.example;
/**
 * Account class represents a bank account.
 */
public class Account {
    private Customer customer;
    private double balance;

    /**
     * Constructor to create a new account.
     * @param customer The customer associated with the account.
     */
    public Account(Customer customer) {
        this.customer = customer;
        this.balance = customer.getInitialDeposit();
    }

    /**
     * Deposits money into the account.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the account.
     * @param amount The amount to withdraw.
     * @return True if the withdrawal is successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Checks the current balance of the account.
     * @return The current balance.
     */
    public double checkBalance() {
        return balance;
    }

    /**
     * Gets the associated customer.
     * @return The customer associated with the account.
     */
    public Customer getCustomer() {
        return customer;
    }
}
