package com.cons1.java_basics;

import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit for the fibonacci series : ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        for (int i  = 1 ; i <= n ; i++){
            if (i == 1){
                System.out.print("\n" + a + " ");
                continue;
            }
            if (i == 2){
                System.out.print(b + " ");
                continue;
            }
            if (i > 2){
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}
