package com.cons1.DSA.SortingAlgos;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};

        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            int temp = arr[i];

            for(int j = i+1 ; j< arr.length ; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }

            arr[i] = arr[min];
            arr[min] =  temp;
        }
        System.out.println("\nAfter Selection Sort :");
        for(int i =0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");

    }

}
