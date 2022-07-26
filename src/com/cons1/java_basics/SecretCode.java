package com.cons1.java_basics;

//Wipro Milestone 1 Code.

public class SecretCode {

    public static int isKey(int a, int b, int c){

       /* int n1 = a/1000;
        int n2 = ((b/100)%10);
        int n3 = isMin(c);*/

//        int sum = n1 * n2 + n3;

        return (a/1000) * ((b/100)%10) + isMin(c);
//        return sum;
    }

    public static int isMin(int n){
        int min = 9;

        for(int i = n ; i > 0; i /= 10){
            int r = i % 10;
            if(r < min)
                min = r;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(isKey(4532,4321,5412));
    }
}
