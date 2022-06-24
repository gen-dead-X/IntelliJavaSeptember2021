package com.cons1.LeetCode;

public class BinarySearch {
/*    public int search(int[] nums, int target) { //unoptimized Brute FORCE, Linear Search
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }*/

    public static int search(int[] nums, int target) { //Optimized Binary Search
        int max = nums.length - 1, min = 0;
        int mid = 0;
        for (int i = 0; i < nums.length; i++){
            mid = (min + max) / 2;
            if(target > nums[mid])
                min = mid + 1;
            else if(target < nums[mid])
                max = mid - 1;
            else
                return mid;
            //sout just to update
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
    }
}
