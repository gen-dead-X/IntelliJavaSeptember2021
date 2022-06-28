package com.cons1.LeetCode;/*
package com.cons1.LeetCode;

*/
/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestCommonPrefix {
 /*   public String longestCommonPrefix(String[] strs) { // my bullshits approach

//        String strs[] = {"flower", "flow", "flight"};
        HashMap< Integer, Character> map = new HashMap<Integer, Character>();

        int len = strs[0].length();

        String str = "";

        for (int i = 0 ; i < len ; i++) {
            char ch = strs[i].charAt(i);

            if(strs[i].length() < len)
                len = strs[i].length();
            if(i == 0){
                for (int j = i; i < strs[j].length(); j++)
                    map.put(i , ch);
            }
            for (int j = i; i < strs[j].length(); j++)

                    map.put(i, ch);

        }

        for (Integer name : map.keySet()){

        }









        return strs[0];
    }*/
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return null;

        String s = strs[0];

        for (int i  = 1; i < strs.length; i++)
            while(strs[i].indexOf(s) != 0)
                s = s.substring(0, s.length() - 1);
        return s;
    }

    public static void main(String[] args){
        String strs[] = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}



