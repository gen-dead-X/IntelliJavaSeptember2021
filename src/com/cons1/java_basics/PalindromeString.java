package com.cons1.java_basics;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
//        System.out.println("I am a Man, Not a Women");
//        String sen = "I am a Man, Not a Women";
//        String arr[] = sen.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        String sen = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome (sen));
    }
    public static int isPalindrome(String A) {
        A = A.toLowerCase();

        A = only_string(A);
        System.out.println(A);
        String sen = "";
        for (int i = A.length() - 1; i >= 0 ; i--) {
            sen += A.charAt(i);
        }
        System.out.println(sen);
        if (sen.equals(A))
            return 1;
        else
            return 0;
//        String arr[] = A.split(" ");
//        for (int i = arr.length - 1; i >= 0 ; i --){
//            for (int j = arr[i].length() - 1 ; j >= 0 ; j--) {
//                if(Character.isLetterOrDigit(arr[i].charAt(j)) == true)
//                    sen += arr[i].charAt(j);
//            }
//        }
//        String senmain = "";
//        for (int i = 0; i < arr.length ; i ++){
//            for (int j = 0 ; j < arr[i].length() ; j++) {
//                if(Character.isLetterOrDigit(arr[i].charAt(j)) == true)
//                    senmain += arr[i].charAt(j);
//            }
//        }
//        if (senmain.equals(sen))
//            return 1;
//        else
//            return 0;
    }

    public static String only_string(String s){
        String sen = "";
        for (int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))) {
                sen += s.charAt(i);
            }
        }
        return sen;
    }
}
