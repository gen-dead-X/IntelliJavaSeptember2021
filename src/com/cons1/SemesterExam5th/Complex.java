package com.cons1.SemesterExam5th;

import java.util.*;
public class Complex {
    int a;
    int b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    public  static void isEqual(int a, int b) {
        if(a == b)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void main(String[] args){
        System.out.println("Here  a = 6 and b = 5 for subtraction and 5 and 5 for checking equal.");
        subtract(6 , 5);
        isEqual(5 , 5);
    }
}
