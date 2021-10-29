package com.cons1.ArraysInJava;

public class reverseArray<i> {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
            //very good
        }
        System.out.println();
        int[] arr = {56, 25, 48, 69, 13, 88, 36};
        //max and sort
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print(max + " ");

        System.out.println();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

