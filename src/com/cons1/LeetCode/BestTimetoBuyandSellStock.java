package com.cons1.LeetCode;

public class BestTimetoBuyandSellStock { //Optimized Code (Very Easy)
/*    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < minprice)
                minprice = prices[i];
            if(prices[i] - minprice > maxProfit)
                maxProfit = prices[i] - minprice;
        }
        return maxProfit;
    }*/

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minprice = Integer.MAX_VALUE;

        for (int i = 0 ; i < prices.length ; i++){
            if (prices[i] < minprice) //7 1 5 3 6 4  so here suppose min price = 1
                minprice = prices[i]; // therefore min price = 1
            if(prices[i] - minprice > maxProfit) // suppose 6 - 1 = 5 so its in the max profit
                maxProfit = prices[i] - minprice; //therefore masProfit will now store 5 and will return 5
        }
        return maxProfit;
    }
    public static void main(String[] args) {
       int arr[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
}
