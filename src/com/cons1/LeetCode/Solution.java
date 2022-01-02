package com.cons1.LeetCode;

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {


        int n = 0;

        String password = "Hn@ipa5";



        int chk_upper = 0;
        int chk_lower = 0;
        int chk_spl = 0;
        int chk_no = 0;

        for(int i = 0 ; i< password.length(); i++){
            char ch= password.charAt(i);

            if(Character.isDigit(ch))
                chk_no = 1;
            if(Character.isUpperCase(ch))
                chk_upper = 1;
            if(Character.isLowerCase(ch))
                chk_lower = 1;
        }
        char spl_char[] = {'!', '@', '#' , '$', '%', '^', '&', '*', '(', ')', '-', '+'} ;
        for(int i = 0 ; i< password.length(); i++){
            for(int j = 0 ; j< spl_char.length; j++){
                char ch = password.charAt(i);
                if((ch == spl_char[j]))
                    chk_spl = 1;
            }
            if(chk_spl == 1)
                break;
        }

        int length = 0;
        if(password.length() < 6)
            length = 6-password.length();
        if(chk_no == 1)
            n++;
        if(chk_upper == 1)
            n++;
        if(chk_spl == 1)
            n++;
        if(chk_lower == 1)
            n++;


        System.out.println("The required no of character needed is: " + (4 - n) + " and the length should be increased by  " + length);
    }
}
