package com.cons1.JavaAssignmentsRCC.Ass25112021;

public class CurrentAccount extends Accounts{
    double overdraftlimit;

    CurrentAccount(double balance, long accountno, String holdersname) {
        super(balance, accountno, holdersname);
        this.overdraftlimit = 40000.0;
    }

    public void display(){
        System.out.println("The overdraft Limit is  : " + overdraftlimit);
    }
}
