package com.cons1.JavaAssignmentsRCC.Ass25112021;

import java.util.*;
abstract class Shape
{
    abstract void calculatearea();
}

class Circle extends Shape
{
    private float radius;
    Circle(float r)
    {
        radius=r;
    }
    void calculatearea()
    {
        System.out.println("The area of circle is: " + (3.142*radius*radius));
    }
}

class Shp
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r=sc.nextFloat();
        Circle c=new Circle(r);
        c.calculatearea();
    }
}

