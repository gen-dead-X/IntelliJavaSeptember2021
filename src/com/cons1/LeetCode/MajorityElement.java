package com.cons1.LeetCode;

import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        //sort the array of nums.length
        //this way the M elements is at nums.length/2 [2,2,1,1,1,2,2] = [1,1,1,2,2,2,2]
        Arrays.sort(nums);
        //return the value at nums.length/2 index
        return nums[nums.length / 2];

    }

    public static void main(String[] args){
        int a[] = {4,4,4,1,1,8,8,8,8,8,7,7,7,7,7,6,6,6,5,5,5,5,5,5,7,7,7,8,8,8,8,8,8,9,9,9,};
        System.out.println(majorityElement(a));
        System.out.println((int)Math.log10(199) + 1);
    }
}

