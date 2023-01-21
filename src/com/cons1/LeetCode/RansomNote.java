package com.cons1.LeetCode;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();


        for (int i = 0; i < magazine.length(); i++) {
            if (map1.containsKey(magazine.charAt(i)))
                map1.put(magazine.charAt(i), map1.get(magazine.charAt(i)) + 1);
            else
                map1.put(magazine.charAt(i), 1);
        }

/*        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }*/
    /*    System.out.println("Magazine: ");
        for (Character c :map1.keySet()){
            System.out.println(c + ": " + map1.get(c));
        }

        System.out.println("RansomNote: ");
        for (Character c :map2.keySet()) {
            System.out.println(c + ": " + map2.get(c));
        }*/
      /*  for (Character c : map2.keySet()) {
            if (map1.containsKey(c)) {
                while (map1.get(c) > 0 && map2.get(c) > 0) {
                    map1.put(c, map1.get(c) - 1);
                    map2.put(c, map2.get(c) - 1);
                }
                if (map1.get(c) > 0 && map2.get(c) <= 0 || map1.get(c) <= 0 && map2.get(c) > 0)
                    return false;
            }
        }*/

        for(Character c : ransomNote.toCharArray()){
            if(!map1.containsKey(c) || map1.get(c) <= 0  ){
                return false;
            }
            else{
                map1.put(c, map1.get(c) - 1);
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
