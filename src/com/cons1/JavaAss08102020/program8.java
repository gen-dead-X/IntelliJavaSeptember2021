package com.cons1.JavaAss08102020;

//        Create a class Complex and implement add(), subtract() and isequal()
//        operation.

import java.util.Scanner;

public class program8 {
    int a;
    int b;

    public program8(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(){

        System.out.print("The sum is : " + (a + b) + "\n");

    }

    public void subtract(){
        System.out.print("The subtraction is : " + (a - b) + "\n");

    }

    public void isequal(){
        if( a == b)
            System.out.println("They are equal! \n");
        else
            System.out.println("They are not equal! \n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        program8 ob = new program8(a , b);

        ob.add();
        ob.subtract();
        ob.isequal();

    }

}
