package com.cons1.LeetCode;

import java.util.*;

public class TwoSum { //Check the unoptimized version at the code named target number, In the leet Code Directory of the same project.
    public static int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0 ; i < nums.length ; i++) {
            if(map.containsKey(target - nums[i])){
                indices[0] = i;
                indices[1] = map.get(target - nums[i]);
                return indices;
            }
            else
                map.put(nums[i], i);
        }
        return null;
     }

     public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int indices[] = new int[2];

        indices = twoSum(nums, 9);
        for(int i : indices) {
            System.out.print(indices[i] + " ");
        }
     }
}
