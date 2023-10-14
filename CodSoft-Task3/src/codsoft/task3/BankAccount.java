
package codsoft.task3;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            //System.out.println("Deposited $" + amount);
            return true;
        } else {
            //System.out.println("Invalid deposit amount");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            //System.out.println("Withdrawn $" + amount);
            return true;
        } else {
            //System.out.println("Insufficient balance or invalid withdrawal amount");
            return false;
        }
    }
}