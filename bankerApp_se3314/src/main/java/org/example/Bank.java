package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Bank class represents a  bank system.
 */
public class Bank {
    private List<Account> accounts;


    /**
     * @param accounts
     */
    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * Constructor to initialize the bank.
     */
    public Bank() {
        accounts = new ArrayList<>();
    }


    public Account createAccount(Customer customer) {
        Account account = new Account(customer);
        accounts.add(account);
        return account;
    }

    public Account getAccount(Customer customer) {
        for (Account account : accounts) {
            if (account.getCustomer().equals(customer)) {
                return account;
            }
        }
        return null;
    }

}

