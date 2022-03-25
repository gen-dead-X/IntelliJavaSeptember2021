package com.cons1.DSA.SortingAlgos;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};

        for(int i =0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");

        for(int i  = 0;  i < arr.length ; i ++){
            for(int j = 1; j < arr.length - i ; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nAfter Selection Sort :");
        for(int i =0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
    }
}
