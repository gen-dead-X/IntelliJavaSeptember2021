package com.cons1.java_basics;

import java.util.Scanner;

public class PrimeInRangeN {

    public static boolean isPrime(int n){
        int c = 0;
        for (int i = 1; i <= n ; i ++){
            if(n % i == 0)
                c++;
        }
        return c == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit : ");
        int lower_limit = sc.nextInt();
        System.out.print("Enter the upper limit : ");
        int upper_limit = sc.nextInt();

        System.out.print("The Prime Nums In the Range are : ");

        for (int i = lower_limit; i <= upper_limit ; i ++){
            boolean check = isPrime(i);
            if(check)
                System.out.print(i + ", ");
        }
    }
}
