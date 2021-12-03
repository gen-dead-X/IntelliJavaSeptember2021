package com.cons1.JavaAssignmentsRCC.Ass25112021;

/*
Create a subclass Test and add the following details:
a. marks of subject1 (sub1):double
b. marks of subject2 (sub2):double
methods are:
a. getMarks(double, double)
b. putMarks()


*/

public class Test extends Student{
    static double sub1;
    static double sub2;

    public void getMarks(double sub1, double sub2){
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    public void putMarks(){
        System.out.println("Marks of subject 1 : " + sub1);
        System.out.println("marks of subject 2 : " + sub2);
    }
}
