package com.cons1.ArraysInJava;

import java.util.Scanner;

public class the2dArray {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int rows = sc.nextInt();
//        int columns = sc.nextInt();
//
//        int arr[][] = new int[rows][columns];
//
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < columns; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < columns; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int row = arr.length;
        int col = arr[0].length;

        System.out.println(row);
        System.out.println(col);
    }
}
