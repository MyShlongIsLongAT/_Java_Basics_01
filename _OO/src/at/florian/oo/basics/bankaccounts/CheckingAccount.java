package at.florian.oo.basics.bankaccounts;

public class CheckingAccount extends BaseAccount {
    private double limit;

    public CheckingAccount(double balance, double limit) {
        super(balance);
        this.limit = limit;
    }

    @Override
    public String withdraw(double amount) {
        if (getBalance() - amount > limit) {
            setBalance(getBalance() - amount);
            return "You have successfully withdrawn " + amount + "€";
        } else {
            return "You are extending your limit!";
        }
    }
}
