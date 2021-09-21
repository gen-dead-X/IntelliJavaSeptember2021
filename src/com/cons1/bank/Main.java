package com.cons1.bank;

public class Main {
    public static void main(String[] args) {

        bank_Details obj = new bank_Details();
        obj.setAcc_holder_name("Nipa Naskar");
        System.out.println("Your name is : " + obj.getAcc_holder_name());
        obj.setAcc_no("88994657145612");
        System.out.println("Your Acc no is : " +obj.getAcc_no());
        obj.setEmail_address("naskarnipa@gmai.com");
        System.out.println("Your email address is : " + obj.getEmail_address());
        obj.setPhone_no("9876543210");
        System.out.println("Your Phone No. is : " + obj.getPhone_no());
        obj.setMain_bal(1500);
        System.out.println("Main Bal : " + obj.getMain_bal());
        obj.setWithdrawl_bal(200.0);
        System.out.println("Main Bal : " + obj.getMain_bal());
        obj.setWithdrawl_bal(100.0);
        System.out.println("Main Bal : " + obj.getMain_bal());
        obj.setWithdrawl_bal(400);
        System.out.println("Main Bal : " + obj.getMain_bal());
        obj.setDiposit_bal(5000.0);
        System.out.println("Main Bal : " + obj.getMain_bal());

    }
}
