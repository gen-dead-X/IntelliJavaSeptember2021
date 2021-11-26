package com.cons1.JavaAssignmentsRCC.Ass25112021;

/*2. Create an abstract class Accounts with the following
        Data members:
        a. Balance
        b. Accountno
        c. Holdersname
        Methods are:
        a. withdrawn()
        b. deposit()
        c. display()

        Create object of these classes and call their methods.*/

public class Accounts {
    static double Balance;
    static long Accountno;
    static String Holdersname;
    static double rate_of_interests;

    protected Accounts(double balance, long accountno, String holdersname) {
        Balance = balance;
        Accountno = accountno;
        Holdersname = holdersname;
    }

    public Accounts(double rate_of_interest){
        this.rate_of_interests = rate_of_interest;
    }

    public void display(){
        System.out.print("\nHoldersname : " + this.Holdersname);
        System.out.print("\nYour Account no : " + this.Accountno);
        System.out.print("\nThe balance is : " + this.Balance + "\n");
    }
    public void withdrawn(long dip_amt){
        this.Balance -= dip_amt;
        System.out.println("Balance after withdrawl of " + dip_amt + " is " + this.Balance);
    }
    public void deposit(long dip_amt){
        this.Balance += dip_amt;
        System.out.println("Balance after diposit of " + dip_amt + " is " + this.Balance);

    }
}
