package com.cons1.java_basics;



import java.util.*;
import java.util.Scanner;

class Pizzas {
    public static int minCose(int n){
        int c = 0;

        while(n > 0){
            if(n == 1){
                n--;
                c += 400;
            }
            else if(n>=2 && n < 10){
                n = n-2;
                c += 750;
            }
            else if(n >= 10 && n < 50){
                n = n - 50;
                c += 3250;
            }
            else if(n >= 50){
                n = n - 50;
                c += 15000;
            }
        }
        return c;
    }
};

class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    }
}
