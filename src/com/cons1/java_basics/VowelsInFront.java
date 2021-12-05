package com.cons1.java_basics;
import  java.util.*;

public class VowelsInFront {
    public static boolean isVowel(char c){
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sen = sc.nextLine();
    }
}
