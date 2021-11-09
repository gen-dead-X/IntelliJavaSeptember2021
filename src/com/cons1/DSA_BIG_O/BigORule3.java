package com.cons1.DSA_BIG_O;
//Different terms for input.
public class BigORule3 {
    public static void justInputs(int num1, int num2){
        for (int i = 1 ; i <= num1; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1 ; i <= num2; i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        justInputs(5,6);
    }
}
