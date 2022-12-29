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
    public static int mostFrequentEven(int[] nums) {
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
        int min = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        int c = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        //for (String name : gfg.keySet())
        for (int key : map.keySet()) {
            if (key % 2 == 0) {
                c = 1;
                if (map.get(key) > r ){

                    if(key < min)
                        min = key;
                    if(map.get(min) < map.get(key))
                        min = map.get(key);
                    r = map.get(key);
                }
            }
        }

        if (c == 0) {
            return -1;
        }
        else
            return min;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,2,4,4,1};

        System.out.println(mostFrequentEven(arr));
    }
}
