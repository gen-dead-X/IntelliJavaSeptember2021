package com.cons1.static_eg;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.print("Enter a Prime Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean a = Main.isPrime(num);

        if (a){
            System.out.println("It's a prime number!");
        }
    }
}
