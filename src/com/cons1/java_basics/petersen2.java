package com.cons1.java_basics;

import java.util.*;

public class petersen2 {
    public static boolean isPeterson(int n) {
        int  rem = 0, sum = 0;
        for (int i = n; i > 0; i = i / 10) {
            int a = 1;
            rem = i % 10;
            for (int j = 1; j <= rem; j++) {
                a = a * j;
            }
            sum = sum + a;

        }
        return sum == n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isPeterson(num)) {
            System.out.print("Peterson number");
        } else
            System.out.print("Non-Peterson number");
    }
}
