package com.cons1.LeetCode;

import java.util.*;

public class FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        if(s.length() == 0) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){  //"l o v e l e e t c o d e"
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c , -1);
            }
            else {
                map.put(c , i);
//                mp.put(s.charAt(i) , i);
                /*arr1[i] = s.charAt(i);
                arr2[i] = s.charAt(i)*/
            }
        }
        int min = Integer.MAX_VALUE;
        for(Character i : map.keySet()) {//leetCode OutPut : 0
            if (map.get(i) > -1 && map.get(i) < min) {
                min = map.get(i);
            }
        }

        return min!=Integer.MAX_VALUE? min : -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
