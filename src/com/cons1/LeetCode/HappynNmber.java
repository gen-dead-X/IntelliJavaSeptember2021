package com.cons1.LeetCode;

import java.util.*;

public class HappynNmber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        int newNum = n;
        while (true) {
            if (newNum == 1) {
                return true;
            }
            int temp = 0;
            // int digit = (int)(Math.log10(newNum) + 1);
            // for (int i = 1; i <= digit; i++) {
            //     temp += Math.pow(newNum % 10, 2); //
            //     newNum /= 10;
            // }
            // int digit = (int)(Math.log10(newNum) + 1);
            for (int i = newNum; i > 0; i /= 10) {
                temp += (i % 10) * (i % 10); //
                // newNum /= 10;
            }
//            System.out.println(temp);
            if (set.contains(temp)) {
                return false;
            }
            set.add(temp);
            newNum = temp;
        }
    }


    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
