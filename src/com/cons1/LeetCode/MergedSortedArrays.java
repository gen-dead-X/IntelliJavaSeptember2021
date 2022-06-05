package com.cons1.LeetCode;

public class MergedSortedArrays {
   /* public static void main(String[] args) {
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
    }*/
   public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
       /* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
       Output: [1,2,2,3,5,6]
       Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
       The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/
       int p = m + n -1;
       int p1 = m -  1 ;
       int p2 = n - 1;

       while(p1 >= 0 && p2 >= 0){
           if(nums1[p1] > nums2[p2]) {
               nums1[p] = nums1[p1];
               p--;
               p1--;
           }
           else {
               nums1[p] = nums2[p2];
               p--;
               p2--;
           }
       }
       while(p2 >= 0) {
           nums1[p] = nums2[p2];
           p--;
           p2--;
       }
       return nums1;
   }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int m = 3,  n = 3;

        int nums[] = new int[m + n + n];
        nums = merge(nums1 , m, nums2, n);

        for(int i : nums)
            System.out.print(nums[i] + " ");
    }
}
