package com.cons1.static_eg;


import java.util.*;

public class Main4 {
    static boolean isPrime(int num){
        int c = 0;
        for(int i = 1 ; i <= num ; i ++){
            if(num % i == 0)
                c++;
        }
        return  c == 2;
    }
    public static int isEmirp(int n){
        int rev = 0;
        for(int i = n ; i > 0; i/= 10){
            int r = i % 10;
            rev = rev*10 + r;
        }
        return  rev;
    }
    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number is: ");
        int num = sc.nextInt();
        if (isPrime(num)){
            int a = isEmirp(num);
            if (isPrime(a)){
                System.out.println("It's Emirp number");
            }
        }
        else
            System.out.println("It's not Emirp number");
    }
}
