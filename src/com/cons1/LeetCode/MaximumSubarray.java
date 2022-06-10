package com.cons1.LeetCode;

public class MaximumSubarray { // Kadane's Algorithm
   /* public static int maxSubArray(int[] nums) {
        int max = nums[1];
        int sum = 0;

        for (int i = 0; i < nums.length ; i ++) {

            sum += nums[i];
            if (sum > max)
                max = sum;

            if(sum < 0)
                sum = 0;
//
//            System.out.println(max);
        }
        return max;
    }*/
   public static int maxSubArray(int[] nums) {
       int maxsum = nums[0];
       int sum = 0;

       for(int i = 0 ; i < nums.length ; i++) {
           sum += nums[i];

           if(sum > maxsum)
               maxsum = sum;

           if(sum < 0)
               sum = 0;
       }
       return maxsum;
   }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

//        int sum = maxSubArray(nums);

        System.out.println(maxSubArray(nums));
    }
}
