package oop.Encapsulation;

public class BankAccount {
    // Private fields - Encapsulation
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public methods to access and modify the private fields
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

/**
 *  Encapsulation is the bundling of data (attributes) and methods that operate on the data into a single unit, known as a class.
 *  It also involves restricting direct access to some of the object's components, which is typically achieved using access modifiers.

 *  Key Points:

 * Data Hiding: Encapsulation hides the internal state of the object and requires all interaction to be performed through the object's methods.
 * Maintainability: Encapsulation increases code maintainability by allowing changes to be made internally without affecting external code.
 */