package com.cons1.JavaExperiments;

public class ArraySizeTest {
    public static void main(String[] args) {  //Experimenting with ArraySizeTest and found out empty spaces are being filled up by default values.
        int arr[] = {0, 1 ,2, 3, 4, 5, 6, 7};
        int arr2[] = new int[10];
        for(int i : arr)
            arr2[i] = arr[i];

        for(int i : arr2)
            System.out.print(arr2[i] + " ");

        System.out.println();

        for(int i : arr)
            System.out.print(arr[i] + " ");
    }
}
