package com.cons1.ArraysInJava;

import java.util.Arrays;

public class array1st {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = a;
        a[2] = 5;
//        System.out.println();
//        a[3] = 6;
//        for (int i = 0 ; i < a.length  ; i ++){
//            System.out.print(b[i] + " ");
//        }
        b = Arrays.copyOf(a, a.length);
        for (int i = 0 ; i < a.length  ; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        a[2] = 4;
        for (int i = 0 ; i < a.length  ; i ++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < a.length  ; i++){
            System.out.print(b[i] + " ");
        }
    }//7478501899
}
