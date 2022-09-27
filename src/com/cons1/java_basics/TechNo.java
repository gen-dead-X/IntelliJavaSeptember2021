package com.cons1.java_basics;

import java.util.*;

//2025 = 20 + 25 = 45 ^ 2 = 2025
public class TechNo {
    public static boolean isTech(int n) {
        Automorphic cnt = new Automorphic();
        int c = cnt.count(n); //4
        int a = n / ((int) Math.pow(10, c / 2));  //2520 = 2025 / 100 = 20
        int b = n % ((int) Math.pow(10, c / 2));  //2025 = 2025 % 100 = 25
        System.out.println(a + " " + b);

        return (a + b) * (a + b) == n;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number:");
        int num = sc.nextInt();
        if (isTech(num))
            System.out.print("Tech number");
        else
            System.out.print("Non-Tech number");
    }
}

