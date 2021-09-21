package com.cons1.VipCustomer;

public class VipCustomer {
    String name;
    double credit_limit;
    String email;

    VipCustomer(){
        this("Joyrudra Biswas" , "joyrudrabws07@gmail.com" , 1050);
    }
    VipCustomer(String name , String email, double credit_limit){
        this.name = name;
        this.email = email;
        this.credit_limit = credit_limit;
    }
    VipCustomer(String name , double credit_limit){
        this.name = name;
        this.credit_limit = credit_limit;
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}

