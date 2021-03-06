package com.cons1.JavaAssignmentsRCC.Ass08102021;

//1. Create a class Rectangle with two instance variables:
//        a. length : int
//        b. width : int
//        and two methods:
//        i. calcArea(): int
//        ii. display(): void
//        Use them from main method declared in the same class.

public class Program1 {
    int length;
    int width;
    int area;

    public Program1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calcArea(){
        area = this.length * this.width;
    }

    public void display(){
        System.out.print("The area is : " + area);
    }

    public static void main(String[] args) {
        Program1 ob = new Program1(5, 6);

        ob.calcArea();
        ob.display();
    }

}
