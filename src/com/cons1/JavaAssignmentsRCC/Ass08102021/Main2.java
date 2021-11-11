package com.cons1.JavaAssignmentsRCC.Ass08102021;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the scores for the following : ");
        System.out.print("A : ");
        double a = sc.nextDouble();
        System.out.print("\nB : ");
        double b = sc.nextDouble();
        System.out.print("\nC : ");
        double c = sc.nextDouble();

        Program2 TestScores = new Program2(a, b, c);

        System.out.println("The average is : " + TestScores.getAvg() );

    }
}
