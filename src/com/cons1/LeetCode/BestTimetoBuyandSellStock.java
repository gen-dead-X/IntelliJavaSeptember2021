package com.cons1.LeetCode;

public class BestTimetoBuyandSellStock { //Optimized Code (Very Easy)
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < minprice)
                minprice = prices[i];
            if(prices[i] - minprice > maxProfit)
                maxProfit = prices[i] - minprice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
       int arr[] = {7,6,4,3,1};

        System.out.println(maxProfit(arr));
    }
}
