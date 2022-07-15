package com.cons1.LeetCode;

import java.util.HashMap;

public class ImplementOfStr {
    public static int strStr(String haystack, String needle) {

//        if(haystack.compareTo(needle) == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : haystack.toCharArray())
           map.put(c, map.getOrDefault(c, 0) + 1);
        char ch = needle.charAt(0);
        for(Character c : needle.toCharArray()){
            if(map.containsKey(c) && map.get(c) != 0){
                map.put(c , map.get(c) - 1);
                ch = c;
                break;
            }
            else if(!map.containsKey(c)) {
                return -1;
            }
        }
        for(int i = 0 ; i < haystack.length() ; i++){
            if(haystack.charAt(i) ==  ch)
                return i;
        }

       /* for(Character c : haystack.toCharArray()){
            if(ch == c)
                return haystack.charAt(c);
        }*/
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
