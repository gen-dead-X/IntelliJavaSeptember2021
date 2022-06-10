package com.cons1.LeetCode;
import java.util.*;

public class FindingDuplicates {
//}

//class Solution {
/*
    public static boolean containsDuplicate(int[] nums) {  //unoptimized
        Arrays.sort(nums);

//        for(int i = 0 ;  i < nums.length ; i++) {
//            System.out.println(nums[i] + " ");
//        }
        int flag = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]){
                flag = 0;
                break;
            }
        }
        return flag == 0;
    }
*/


/*public static boolean containsDuplicate(int[] nums) { //optimized Version 1 Using maps
    Map<Integer,Integer> mp = new HashMap();
    int n = nums.length;

    for(int i = 0; i < n ; i++)
            if(mp.containsKey(nums[i]))
            mp.put(nums[i], mp.get(nums[i]) + 1);
      else
              mp.put(nums[i], 1);


    for(Integer value: mp.values())
            if(value > 1)
            return true;

    return false;
}*/

/*    public static boolean containsDuplicate(int[] nums) { //optimized Version 1 Using hashset
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0 ; i <  nums.length; i++) {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }*/
/*    public static boolean containsDuplicate(int[] nums) { //UNoptimized Version 1 Using hashset


        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j  < nums.length ; j++){
                if(j == i)
                    continue;
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }*/
    public static boolean containsDuplicate(int[] nums) { //optimized Version 1 Using hashset
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
                return true;
            }
            else
                map.put(nums[i], 1);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 9, 8, 8};
        boolean flag = containsDuplicate(nums);
        if(flag == false)
            System.out.println("No Duplicates!");
        else
            System.out.println("Duplicates Found!");
    }
}
