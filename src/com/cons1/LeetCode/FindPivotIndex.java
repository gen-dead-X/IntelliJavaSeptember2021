package com.cons1.LeetCode;

/*      Input: nums = [1,7,3,6,5,6]
        Output: 3
        Explanation:
        The pivot index is 3.
        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11*/

import java.util.Arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if(nums.length < 1) return -1;
        int rsum = 0, lsum = 0;
        for(int i = 0; i < nums.length; i++)
            rsum += nums[i];
        int i = 0;
        while(i < nums.length){
            rsum -= nums[i];
            if(rsum == lsum) return i;
            lsum += nums[i];
        }
        return -1;
    }
}
