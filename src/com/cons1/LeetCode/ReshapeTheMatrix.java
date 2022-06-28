package com.cons1.LeetCode;

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if((rows*columns) != r * c) return mat;

        int new_mat[][] = new int[rows][columns];

        int row = 0;
        int col = 0;

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                new_mat[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return new_mat;
    }
    /*
    class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(r*c != mat.length*mat[0].length) return mat;
            int[][] new_mat = new int[r][c];

            int row = 0;
            int col = 0;

            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    new_mat[row][col] = mat[i][j];
                    col++;
                    if(col==c){
                        col = 0;
                        row++;
                    }
                }
            }

            return new_mat;
    }
}
    */
    public static void main(String[] args) {
        int[][] matrix = {{1,2} , {3,4}};
        int[][] matrixResh = new int[matrix.length][matrix[0].length];
        matrixResh = matrixReshape(matrix , matrix.length, matrix[0].length);

        for(int i = 0; i < matrixResh.length ; i++)
            for(int j = 0; j < matrixResh[0].length; j++)
                System.out.print(matrixResh[i][j] + " ");
            System.out.println();

    }
}
