package com.cons1.LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class EqualArrays {

    public static int isEqual(int A[], int B[]) {
        if(A.length != B.length) return 0;
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (int i = 0; i < A.length; i++) {
            if (map1.containsKey(A[i]))
                map1.put(A[i], map1.get(A[i]) + 1);
            else
                map1.put(A[i], 1);
        }

        for(int i = 0; i < B.length; i++){
            if(map1.containsKey(B[i]) && map1.get(B[i]) != 0){
                map1.put(B[i], map1.get(B[i]) - 1);
            }
            else
                return 0;
        }

        return 1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];
        for ( int i = 0; i < n; i++ ){
            A[i] = sc.nextInt();
        }
        for ( int i = 0; i < n; i++ ){
            B[i] = sc.nextInt();
        }
        System.out.println(isEqual(A, B));
    }
}
