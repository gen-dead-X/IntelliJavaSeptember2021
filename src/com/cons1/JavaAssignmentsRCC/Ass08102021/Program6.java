package com.cons1.JavaAssignmentsRCC.Ass08102021;

//        Create a class named Figure. Make cube, cylinder and sphere as object of
//        the class Figure and calculate their surface area using concept of
//        constructor overloading.

public class Program6 {

    static double area;
    double side;
    double height;
    double length;
    double radius;
    final double pi = 3.142;

    public Program6(double side) {
        this.side = side;
        area = 6.0 * this.side * this.side;
        System.out.println("The area is : " + area);
    }
    public Program6(double radius, double height){
        this.radius = radius;
        this.height = height;
        area = 2.0 * pi * this.radius *  this.height;
        System.out.println("The area is : " + area);
    }
    public  Program6(double radius, int side){
        this.radius = radius;
        area = 4 * pi * this.radius * this.radius;
        System.out.println("The area is : " + area);
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
// some time passes
        System.out.println("The side of the cube is : 2");
        Program6 area_cube = new Program6(2);

        System.out.println("The radius and height of the cylinder is : 1 and 2 respectively.");
        Program6 area_cylinder = new Program6(1.0 , 2.0);

        System.out.println("The radius of the sphere is : 2");
        Program6 area_sphere = new Program6(2.0 , 0 );

        long end = System.currentTimeMillis();
        System.out.println("Total Time taken is " + (end - start)/1000.0 + " seconds.");

    }
}
