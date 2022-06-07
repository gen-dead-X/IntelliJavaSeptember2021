package com.cons1.LeetCode;

public class SearchInsertPosition {
/*    public static int searchInsert(int[] nums, int target) {

        //My own take
        int pos = -1;
        int min = 0, max = nums.length - 1, mid = 0;
        int pmin = 0, pmax = 0;

        while(min <= max){
            mid = (max + min) / 2;

            if(target > nums[mid])
                min = mid + 1;
            else if(target < nums[mid])
                max = mid - 1;
            else {
                pos = 0;
                return mid;
            }
        }

        min = 0; max = nums.length - 1; mid = 0;
        if(pos == -1){
            while(min <= max){
                mid = (max + mid) / 2;
                if(target >= nums[mid]) {
                    pmin = mid;
                    min = mid + 1;
                }
                else if(target <= nums[mid]) {
                    pmax = mid;
                    max = mid - 1;
                }
                if(pmax == pmin)
                    return pmax;
            }
        }
        return pmax;
    }*/
    public static int searchInsert(int[] nums, int target) { //Optimized code
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] <  target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    public static void main(String[] args) {
       int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(searchInsert(nums, 10));
    }
}
