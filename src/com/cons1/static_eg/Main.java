package com.cons1.static_eg;

import java.util.Scanner;

public class Main {

    static int a;
    int b;

    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static boolean isPrime(int num){
        int c = 0;
        for(int i = 1 ; i <= num ; i ++){
            if(num%i == 0)
                c++;
        }
        return  c == 2;
    }

    public static void main(String[] args) {

        Main ob = new Main(5, 8);
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
