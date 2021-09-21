package com.cons1.bank;

public class bank_Details {
    String acc_holder_name;
    String acc_no;
    String email_address;
    String phone_no;
    double main_bal;
    double diposit_bal;
    double withdrawl_bal;

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public double getMain_bal() {
        return main_bal;
    }

    public void setMain_bal(double main_bal) {
        this.main_bal = main_bal;
    }

    public double getDiposit_bal() {
        return diposit_bal;
    }

    public void setDiposit_bal(double diposit_bal) {
        this.diposit_bal = diposit_bal;
        this.main_bal = this.main_bal + this.diposit_bal;
    }

    public double getWithdrawl_bal() {
        return withdrawl_bal;
    }

    public void setWithdrawl_bal(double withdrawl_bal) {
        if(this.main_bal - withdrawl_bal < 1000)
            System.out.println("Your acc doesnt have sufficient bal");
        else{
            this.withdrawl_bal = withdrawl_bal;
            this.main_bal = this.main_bal - this.withdrawl_bal;
        }
    }
}

