package com.cons1.printer;

import java.util.*;
//INPUT: 10 20 30 40 50 60
//OUTPUT: 60 10 50 20 40 30
//
//INPUT: 10 20 30 40 50 60 70 80
//OUTPUT: 80 10 70 20 60 30 50 40
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[size];
        int p1 = arr1.length - 1;
        int p2 = 0;
        int p3 = 0;

        //INPUT: 10 20 30 40 50 60
        //OUTPUT: 60 10 50 20 40 30

        for (int i = 0; i < size; i++){
            if(i % 2 == 0){
                arr2[i] = arr1[p1--];  //5
            }else {
                arr2[i] = arr1[p2];
                p2++;}
            }


        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
