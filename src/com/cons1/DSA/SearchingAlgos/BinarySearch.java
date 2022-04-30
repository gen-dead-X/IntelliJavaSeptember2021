package com.cons1.DSA.SearchingAlgos;

import java.util.*;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int n = 7;

        int a = 0, b = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {
            int mid = (a + b) / 2 ;
            System.out.println(mid);
            if(mid == n){
                System.out.println("Found at pos : " + mid);
                break;
            }

            else if(mid < n)
                a = mid;

            else if(mid > n)
                b = mid;

        }
    }
}
