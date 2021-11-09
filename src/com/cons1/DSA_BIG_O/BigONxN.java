package com.cons1.DSA_BIG_O;

public class BigONxN {
    int num = 0;
    public static void innerLoops(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print( i + j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        BigONxN ob = new BigONxN();
//        ob.num = 5;
//        ob.innerLoops(5);
        innerLoops(5);
    }
}
