package com.cons1.LeetCode;

/*        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
import java.util.*;

public class RotateArray {
/*    public static int[] rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int p = 0;
        while(p < nums.length)
            list.add(nums[p++]);

        System.out.println();
        int h = 0;
        for(int i = nums.length - 1; h < k ;  ) {
            list.add(0, list.get(i));
            h++;
        }
        for (int i = 0; i < nums.length; i ++){
            nums[i] = list.get(i);
        }
        return nums;
    }*/
    public static int[] rotate(int[] nums, int k) {
        k = k% nums.length;
        reverse(nums, 0 , nums.length - 1);
        reverse(nums, 0 , k - 1);
        reverse(nums, k , nums.length - 1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
         }
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        int arr[] = new int[num.length];

        arr = rotate(num , 3);
        System.out.println();
        System.out.println("Final Result :");
       for(int i = 0; i < arr.length; i++)
           System.out.print(arr[i] + " ");
    }
}
