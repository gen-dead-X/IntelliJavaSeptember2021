package com.cons1.LeetCode;

public class MergedSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {0, 1, 3, 5, 7};
        int arr2[] = {2, 4, 5, 6, 8};

        int arr[] = new int[arr1.length + arr2.length];
        int pos1 = 0, pos2 = 0;

        for(int i = 0; i < arr.length - 1 ; i++){
            if(arr1[pos1] < arr2[pos2]){
                arr[i] = arr1[pos1++];
            }
            else if(arr2[pos2] < arr1[pos1]){
                arr[i] = arr2[pos2++];
            }
            else{
                arr[i++] = arr1[pos1++];
                arr[i] = arr2[pos2++];
            }

        }
        if((arr1.length) != pos1)
            arr[arr.length - 1] = arr1[pos1];
        if((arr2.length) != pos2)
            arr[arr.length - 1] = arr2[pos2];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
