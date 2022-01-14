package com.cons1.SemesterExam5th;

public class TheOutOfBounds {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5};

        try {
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println((exception));
        }
        finally {
            System.out.println("To solve the Exception you have to access a index within the range.");
        }
    }
}
