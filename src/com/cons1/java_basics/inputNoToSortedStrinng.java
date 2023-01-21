package com.cons1.java_basics;
import java.util.*;

public class inputNoToSortedStrinng {
    public static void resultantString(String N){

        int asci = 65;
        int converter = 0;
        String s="";

        for(int i = 0; i<N.length(); i++){
            converter = Integer.parseInt(String.valueOf(N.charAt(i)));
//            abc_Calc(converter);
            s += abc_Calc(converter);
        }

        String s1 = sortingS(s);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        resultantString("39564");

    }

    public static char abc_Calc(int n){
        char c = 'a';
        int a = 1;

        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 65; i<=91 ; i ++){
            char ch = (char)i;
            map.put(a++,ch);
        }
        return map.get(n);
    }
    public static String sortingS(String s){
        char tempArray[] = s.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

}
