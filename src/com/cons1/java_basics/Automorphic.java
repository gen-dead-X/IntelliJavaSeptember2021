package com.cons1.java_basics;

import java.util.*;
public class Automorphic {
    public static boolean isAutomorphic(int n){
        int c = count(n);
        System.out.println(c);
        int rem = 0;
        int a = n*n;
        int mod = 10 * c;
//        for(int i = ; i>0; i=i/10){
//            rem = i%10 * c ;
//        }
        rem = a % (int)Math.pow(10, c);
        System.out.println(a);
        System.out.println(rem);
        return rem == n;
    }

    public static int count(int n){
        int c = 0;
        int i = n;
        while(i>0){
            i = i/10;
            c++;
        }
        return c;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isAutomorphic(num)){
            System.out.print("Automorphic number");
        }
        else{
            System.out.print("Non-Automorphic number");
        }
    }
}
