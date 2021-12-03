package com.cons1.JavaAssignmentsRCC.Ass25112021;

/*3. Create an class Student with the following
        Data members:
        a. roll
        Methods are:

        a. getRoll(int) //take input
        b. putRoll(int) //display data member


        Create interface Attendance with the following details:

        a. Atten
        method: putAttendance()
        Create a class Result which extend from Test and implements interface
        Attendance with the following details:
        a. total
        methods are:
        a. putAttendance() //implements interface (display atten)
        b. marksAdd() //sub1+sub2+atten
        c. display()
        Create object of Result class and call the methods.*/

public class Student{
    int roll;

    public void  getRoll(int roll){
        this.roll = roll;
    }
    public void putRoll(){
        System.out.println("Your Rol is : " + this.roll);
    }
}
