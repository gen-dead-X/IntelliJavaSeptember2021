package com.cons1.java_basics;
import java.util.Scanner;

public class additionRefrence {
    int num = 0;
    public void reverse(){
        int sum = 0;
        for(int i = num; i > 0 ; i/=10 ){
            int r = i % 10;
            sum = sum * 10 + r;
        }
        System.out.println("The Reversed number is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        additionRefrence ob = new additionRefrence();
        System.out.print("Enter a number to reverse : ");
        ob.num = sc.nextInt();
        ob.reverse();
    }
}
