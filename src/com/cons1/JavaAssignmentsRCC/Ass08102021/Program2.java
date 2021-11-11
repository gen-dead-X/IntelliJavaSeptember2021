package com.cons1.JavaAssignmentsRCC.Ass08102021;

//        Design a TestScores class that has fields to hold three test scores and a
//        method that returns the average of the test scores. Demonstrate the class
//        by writing a separate program that creates an instance of the class. The
//        program should ask the user to enter three test scores, which are stored in
//        the TestScores object. Then the program should display the average of
//        scores, as reported by the TestScores object.

public class Program2 {

    double a;
    double b;
    double c;

    public Program2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getAvg() {
        return (a  + b + c) / 3;
    }
}
