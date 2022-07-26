package com.cons1.java_basics;

import java.util.*;

//Wipro Milestone Problem.

//1. Concat
//2. NO white Spaces
//3. No repeating

public class ConcatProblem {

    public static String isSexString(String s1, String s2){

        s1 = s1 + s2;
        s1.toLowerCase();
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(isSexString("        I love you UwU" , " But I have a boyfriend!        "));
    }
}
