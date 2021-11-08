package com.cons1.java_basics;

import java.util.*;

public class add_return{
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number of b : ");
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println(sum);
    }
}