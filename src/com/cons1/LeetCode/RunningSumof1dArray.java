package com.cons1.LeetCode;

/*Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int arr1[] = new int[nums.length];
        for ( int i = 1; i < nums.length; i++ ) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}

