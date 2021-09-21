package com.cons1.VipCustomer;

public class Main {
    public static void main(String[] args) {
        VipCustomer ob = new VipCustomer("Joyrudra Biswas" , "joyrudrabws07@gmail.com" , 1050);
        System.out.print("Name : " + ob.getName());
        System.out.print("\nEmail Address : " + ob.getEmail());
        System.out.print("\nCredit Limit : " + ob.getCredit_limit());

    }

}
