package com.cons1.JavaAss08102020;

//10. Create a class Triangle with two instance variables:
//        a. base: int
//        b. height: int
//        And two methods:
//        i. area(): double
//        ii. display(): void
//        Use constructor to initialized the instance variables. Create an array of
//        objects of type Triangle. Calculate and display the area of the object with
//        highest area in main().

import java.util.*;

class Program10 {
    int base;
    int height;

    Program10(int b, int h) {
        base = b;
        height = h;
    }

    double area() {
        double area = 0.5 * base * height;
        return (area);
    }

    void display() {
        System.out.println("The Triangle whose area is maximum has area = " + this.area());
    }
}

class Main10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int b, h, n, i;
        System.out.println("Enter the number of triangles: ");
        n = sc.nextInt();

        Program10 tgles[] = new Program10[n]; //declaration of array of object

        for (i = 0; i < n; i++) {
            System.out.println("Enter the base and height of Traingle " + (i + 1));
            b = sc.nextInt();
            h = sc.nextInt();
            tgles[i] = new Program10(b, h);
        }
        Program10 max = tgles[0];
        for (i = 1; i < n; i++)
            if (tgles[i].area() > max.area())
                max = tgles[i];
        max.display();
    }
}
