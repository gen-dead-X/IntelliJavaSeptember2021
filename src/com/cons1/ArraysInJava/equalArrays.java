package com.cons1.ArraysInJava;


import java.util.Scanner;


class equalArrays {

    public static int getFirstSetBitPos(int n)
    {
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFirstSetBitPos(n));
    }
}

