package com.cons1.java_basics;

//Arsmstrong no = 153 = 1 + 125 + 27

import java.util.Scanner;

public class Arsmstorng {
    public static boolean isArmstrong(int n){
        int c = count(n);
        int sum = 0;

        for (int i = n; i > 0; i/=10){
            sum += (int) Math.pow(i%10, c);
        }

        return sum ==  n;
    }

    public static int count(int n){
        int c = 0;

        int i = n;
        while(i > 0){
            c++;
            i/=10;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

//        boolean IsArmstrong = isArmstrong(num);
        if(isArmstrong(num))
            System.out.println("It's an Armstrong Number!");
        else
            System.out.println("It's not an Armstrong Number!");
    }
}
