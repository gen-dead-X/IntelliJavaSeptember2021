package com.cons1.JavaAssignmentsRCC.Ass08102021;
/*
        Write a program using parameterized constructors to calculate area of a
        square and a rectangle.
*/


public class Program5 {
    double l;
    double b;
    static double area;

    public Program5(double l, double b) {
        this.l = l;
        this.b = b;
        area = this.l * this.b;
    }

    public Program5(double l) {
        this.l = l;
        area = this.l * this.l;
    }

    public static void main(String[] args) {

        System.out.println("Details for the Rectangle : Length =  5 and breadth = 6");
        Program5 ob = new Program5(5 , 6);
        System.out.print("Area of the rectangle : " + area);
        System.out.println("\nDetails for the square : Length of one side = 5");
        Program5 ob1 = new Program5(5);
        System.out.print("Area of the square : " + area);

    }
}
