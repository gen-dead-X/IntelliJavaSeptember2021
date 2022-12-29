package com.cons1.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

/*
        Example 1:

        Input: nums = [0,1,2,2,4,4,1]
        Output: 2
        Explanation:
        The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
        We return the smallest one, which is 2.
        Example 2:

        Input: nums = [4,4,4,9,2,4]
        Output: 4
        Explanation: 4 is the even element appears the most.
        Example 3:

        Input: nums = [29,47,21,41,13,37,25,7]
        Output: -1
        Explanation: There is no even element.
*/

public class mostFrequentEvenNumber {
/*    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num = 0; num < nums.length; num++) {
            if (map.containsKey(nums[num])) {                      //nums = [0,1,2,2,4,4,1]
                map.put(nums[num], map.get(nums[num]) + 1);
            } else
                map.put(nums[num], 1);
        }
        for (int key : map.keySet()) { //Hash Loop
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println();
        int min = Integer.MIN_VALUE;
        int result = -1;

        //for (String name : gfg.keySet())
        for(Map.Entry<Integer, Integer> element : map.entrySet()) {
            int value = element.getValue(), key = element.getKey();
            if(value > min){
                min = value;
                result = key;
            }else if(value == min){
                if(key < result) result = key;
            }
        }
        System.out.println(min + " = " + map.get(min));
        return  result;
    }*/

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> mapEvenRepeat = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] % 2 == 0){
                mapEvenRepeat.put(nums[i], mapEvenRepeat.getOrDefault(nums[i], 0) + 1);
            }
        }
        int min = Integer.MIN_VALUE;
        int result = -1;
        for(Map.Entry<Integer, Integer> element : mapEvenRepeat.entrySet()) {
            int value = element.getValue(), key = element.getKey();
            if(value > min){
                min = value;
                result = key;
            }else if(value == min){
                if(key < result) result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {9145,1967,6704,9262,5684,2726,7740,95,25,3475,9425,9279,3967,4137,8298,2413,7734,4042,720,9597,913,1928,5818,7473,6696,2010,5452,8750,4930,7092,758,9594,7723,8015,5474,2595,3475,9996,1447,5563,9266,8706,7228,6679,3913,5400,7728,1005,6361,4259,7940,6055,1594,3942,4786,3939,8557,5621,206,6660,3964,4979,9439,3304,744,1912,8597,6016,7128,4580,8339,3060,4299,547,296,2981,4309,2685,8091,1832,6740,7429,8971,3798,7524,2243,4837,6811,2127,5670,5167,9624,8002,6682,2797,5665,8627,6436,1500,346,407,9493,5102,3110,9280,5152,6439,2007,3079,752,7104,905,2793,1851,3842,389,4815,5386,6483,7423,8685,3780,722,5756,7217,2851,7573,411,8961,1644,664,1695,2660,7404,2102,6762,5841,7098,9950,2571,6182,1725,9210,7714,3038,5047,9505,9086,9099,2057,3664,6264,2324,922,4339,6863,50,9856,8933,1676,1028,1257,9590,6019,3226,7547,7742,978,6742,1012,3392,4445,7338,9190,6443,1477,2559,6149,9965,5106,3972,8941,47,7020,1800,6325,2401,2974,5678,1385,4336,7060,9584,5120,5903,5501,1678,5993,6431,1780,491,3196,9430,7155,1816,2643,9056,6102,1373,3562,979,7761,4074,6950,1676,6087,9623,9816,2865,7661,7239,5128,4373,5201,362,4236,8583,9827,6164,4978,3917};

        System.out.println(mostFrequentEven(arr));
    }
}
