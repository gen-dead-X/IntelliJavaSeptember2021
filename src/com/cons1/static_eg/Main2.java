package com.cons1.static_eg;

import java.util.Scanner;

public class Main2 extends Main {

    Main2(){
        super(5 , 6);
    }

    public static void main(String[] args) {

//        Main ob2 = new Main(5, 8);
//        Main ob1 = new Main(6, 9);
//
//        System.out.println(a);
//        System.out.println(ob.b);
//        System.out.println(a);
//        System.out.println(ob1.b);

        System.out.print("Enter a Prime Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean a = isPrime(num);

        if (a){
            System.out.println("It's a prime number!");
        }
    }
}
