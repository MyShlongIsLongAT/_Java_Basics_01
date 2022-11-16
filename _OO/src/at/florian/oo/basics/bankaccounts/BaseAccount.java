package at.florian.oo.basics.bankaccounts;

public class BaseAccount {
    private double balance;

    public BaseAccount(double balance) {
        this.balance = balance;

    }

    public String withdraw(double amount) {
        if (this.balance < amount) {
            return "Your balance is too low";
        } else {
            this.balance -= amount;
            return "You have successfully withdrawn " + amount + "€";
        }
    }

    public String deposit(double amount) {
        this.balance += amount;
        return "You have successfully deposited " + amount + "€";
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
