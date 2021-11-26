package com.cons1.JavaAssignmentsRCC.Ass25112021;

public class Main {
    public static void main(String[] args) {
        String Holdersname = "Joyrudra Biswas";
        long Accountno = 789456231;
        double balance = 4000000.0;
        double intrest = 5.0;

        Accounts account = new Accounts(balance, Accountno, Holdersname);
        SavingsAccount savingsAccount = new SavingsAccount(intrest);
        CurrentAccount currentAccount = new CurrentAccount(balance, Accountno, Holdersname);

        account.display();
        account.withdrawn(10000);
        account.deposit(150000);
        account.withdrawn(485210);
        account.withdrawn(87456);
        account.withdrawn(4100);
        savingsAccount.calculateAmount();
        savingsAccount.display();
        currentAccount.display();
    }
}
