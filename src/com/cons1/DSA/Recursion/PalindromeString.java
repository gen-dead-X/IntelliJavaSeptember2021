package com.cons1.DSA.Recursion;

public class PalindromeString {
    public static boolean isPalindrome(String s, int i ){
        if(i >= s.length()/2)
            return true;
        if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
            System.out.println(s.charAt(i) + " " + s.charAt(s.length() - 1  - i));
            return false;
        }
        else {
            System.out.println(s.charAt(i) + " " + s.charAt(s.length() - 1  - i));
            return isPalindrome(s, i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("IDGAFFAGDI" , 0));
    }
}
