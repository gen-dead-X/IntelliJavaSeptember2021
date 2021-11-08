package com.cons1.LeetCode;

public class TargetNumber {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        int flag = 0;
        for(int i = 0; i <= nums.length ; i++){
            for(int j = i+1; j < nums.length; j++ ){
//                System.out.println(i + ", " + j);
                if ((nums[i] + nums[j]) ==  target ){
                    flag = 1;
                    indexs[0] = i;
                    indexs[1] = j;
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
//                    System.out.println("Index positions : " + "[" + i + "," + j + "]");
                    break;
                }
            }
            if(flag == 1)
                break;
        }
        return indexs;
    }

    public static void main(String[] args) {
//        int arr[] = {1, 2, 9, 0, 3, 4};
        int arr[] = {2, 5, 5, 11};
        int target = 10;
        int[] index = new int[2];
        index = twoSum(arr, target);
        System.out.println("Index positions : " + "[" + index[0] + "," + index[1] + "]");
    }
}
