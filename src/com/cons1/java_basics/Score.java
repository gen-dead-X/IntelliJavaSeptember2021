package com.cons1.java_basics;

import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static boolean isBalanced(String s)
    {
        int flag = 0;
        int a = 0, b = 0, c = 0;
        int fb1 = 0, fb2 = 0, sb1 = 0, sb2 = 0, tb1 = 0, tb2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                fb1 ++;
                a++;
            }
            else if(s.charAt(i) == ')'){
                if(a == 0){
                    flag = 1;
                    fb2--;
                    break;
                }
                else
                    fb2 ++;

            }
            else if(s.charAt(i) == '{') {
                sb1 ++;
                b++;
            }
            else if(s.charAt(i) == '}'){
                if(b == 0){
                    flag = 1;
                    sb2--;
                    break;
                }
                else
                    sb2 ++;
            }
            else if(s.charAt(i) == '['){
                tb1 ++;
                c++;
            }
            else if(s.charAt(i) == ']'  ) {
                if (c == 0) {
                    flag = 1;
                    tb2--;
                    break;
                }
                else
                    tb2++;
            }
            if(i % 2 != 0){
                a = 0;
                b = 0;
                c = 0;
            }

        }

        if( (fb1 == fb2) && (sb1 == sb2) && (tb1 == tb2))
            flag = 0;
        else
             flag = 1;
        return flag == 0;
    }

}


class Solution1 {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
