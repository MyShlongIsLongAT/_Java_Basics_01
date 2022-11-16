package at.florian.oo.basics.bankaccounts;

public class Main {
    public static void main(String[] args) {
        BaseAccount baseAccount = new BaseAccount(10_000.00);

//        System.out.println(baseAccount.deposit(11_000.00));
//        System.out.println(baseAccount.withdraw(20_000.00));
//        System.out.println(baseAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(10_000.00,-1_000);

        System.out.println(checkingAccount.withdraw(10_500));
        System.out.println(checkingAccount.getBalance());

//        SavingsAccount savingsAccount = new SavingsAccount(10_000,0.06);
//        System.out.println(savingsAccount.getFutureBalance(1000));

    }
}
