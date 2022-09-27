package com.cons1.java_basics;

import java.util.Scanner;

public class petersen {
    protected static int fact(int n){
        int sum = 1;

        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Number : ");
        int sum = 0;
        int n = sc.nextInt();
        for(int i = n ; i > 0 ; i/=10){

            sum += fact(i % 10);

            System.out.println(sum);
        }
        if( sum == n)
            System.out.println("OK");
        else
            System.out.println("Not");
    }
}
