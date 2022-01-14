package com.cons1.SemesterExam5th;

public class Main2 {
    public static void main(String args[]) {
        ThreadA_Z obj = new ThreadA_Z();
        try {
            System.out.println("Waiting for Thread to end.");
            obj.t.join();
        } catch (Exception e) {
            System.out.println(" Thread interrupted.");
        }
        System.out.println("User  thread end Printing.");
    }
}
