package at.florian.oo.basics.bankaccounts;

public class SavingsAccount extends BaseAccount {
    private double interest;

    public SavingsAccount(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }

    public double getFutureBalance(double duration) {
        double futureBalance;
        futureBalance = getBalance() * Math.pow((100 + interest) / 100, duration);
        return futureBalance;
    }
}
