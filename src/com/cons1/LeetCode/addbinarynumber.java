package com.cons1.LeetCode;
import java.util.ArrayList;
import java.util.Scanner;
public class addbinarynumber {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );
        int b1 = 0, b2, carry = 0, sum = 0;
        System.out.println ("Enter the 1st num1 : ");
        int num1 = sc.nextInt();
        System.out.println ("Enter the 1st num2 : ");
        int num2 = sc.nextInt();
        int c = 0;
        for(int i = num1 ; i > 0 ; i /= 10)
            c++;
        int arr[] = new int[c + 1] ;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = arr.length - 1 ; i >= 0 ; i--){
            b1 = num1 % 10;
            b2 = num2 % 10;
            num1 = num1/10;
            num2 = num2/10;

            sum = b1 + b2 + carry;
            if (sum == 0){
                arr[i] = 0;
                carry = 0;
            }
            else if (sum == 1){
                arr[i] = 1;
                carry = 0;
            }
            else if (sum == 2){
                arr[i] = 0;
                carry = 1;
            }
            else if (sum == 3){
                arr[i] = 1;
                carry = 1;
            }
        }
        for (int i = 0 ; i <= arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}