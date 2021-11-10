package com.cons1.JavaAss08102020.Ass10112021.Program1;

public class College {

    String collegeName;
    String  address;

    public College(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
    }

    void showDetails(){
        System.out.println("Your College name is : " + collegeName);
        System.out.println("your address is : " + address);
    }

}
