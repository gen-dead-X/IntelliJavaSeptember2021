package com.cons1.LeetCode;

public class BinarySearch {
/*    public int search(int[] nums, int target) { //unoptimized Brute FORCE, Linear Search
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }*/
    public static int search(int[] nums, int target) { //Optimized Binary Searchi
        int min = 0;
        int max = nums.length - 1;
        int mid;

        while (max >= min) {
            mid = min + (max - min) / 2;

            if(nums[mid] > target)
                max = mid - 1;
            else if(nums[mid] < target)
                min = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
    }
}
