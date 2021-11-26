package com.cons1.JavaAssignmentsRCC.Ass25112021;

/*      Create a subclass SavingsAccount of Accounts class and add the following
        details:

        a. rate_of_interest
        methods are:
        a. calculateAmount()
        b. display(), to show rate of interest with current account balance.
        Create another sub class CurrentAccount of Accounts class with the
        following details:
        a. overdraftlimit
        method is display()- to show overdraft amount.*/

public class SavingsAccount extends Accounts {
    double rate_of_interest;

    public SavingsAccount(double rate_of_interest) {
        super(rate_of_interest);
        this.rate_of_interest = rate_of_interest;
    }

    public void calculateAmount(){
        this.Balance = this.Balance + (this.Balance * (this.rate_of_interest / 100.0));
    }
    public void display(){
        System.out.println("Your amount after the rate of interest is  : " + this.Balance);
    }
}
