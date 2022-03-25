package com.cons1.CodeVita;
import java.util.Scanner;

class ChemicalNumberTheory {

    private static char ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int len = input.length;

        int[] arr = new int[len];


        for (int i = 0; i<len; i++) {
            String s = input[i];
            if (s.length() == 1) {
                arr[i] = finalVal(s.charAt(0));
            }
            else {
                int a = finalVal(s.charAt(0)), b  = finalVal(s.charAt(1));
                arr[i] = a * (b+1) + b;
            }
        }

        int sum = 0;

        for (int i = 0; i<len; i++) {
            for (int j=i+1; j<len; j++) {
                int affinity = maxVal(arr[i], arr[j]);
                sum = Math.max(sum, affinity);
            }
        }
        System.out.println(sum);

    }

    static int maxVal(int num1, int num2) {
        int r = 0, a = 0, b = 0;
        a = Math.max(num1, num2);
        b = Math.min(num1, num2);
        r = b;
        while(a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    static int finalVal(char ch) {
        int result;
        ChemicalNumberTheory.ch = ch;
        if (ch >= 'a' && ch <= 'z') {
            result = 36 + ch - 'a';
        } else {
            result = 10 + ch - 'A';
        }

        return result;
    }
}