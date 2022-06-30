package com.cons1.LeetCode;

import com.cons1.main;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
//        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (Character c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        /*for (Character c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }*/

        for (Character c : t.toCharArray()){
            if(map1.containsKey(c) && map1.get(c) > 0)
                map1.put(c, map1.get(c) - 1);
            else
                return false;
        }

        return true;
    }
    /*
        public boolean isAnagram(String s, String t) { //Please Research On it JOY :) !

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int num : freq) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
     */

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "gramang"));
    }
}
