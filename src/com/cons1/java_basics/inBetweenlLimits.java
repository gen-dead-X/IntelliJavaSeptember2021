package com.cons1.java_basics;

import java.util.Scanner;
public class inBetweenlLimits {
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
        System.out.println("Enter the lower limit : ");
        int L_limit = sc.nextInt();
        System.out.println("Enter the upper limit : ");
        int U_limit = sc.nextInt();


        System.out.print("The Prime nos in between the Ranges are : ");
        for (int i = L_limit ; i < U_limit ; i++) {
            if(isPrime(i) == true)
                System.out.print(i + " ");
        }
    }


}
