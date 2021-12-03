package com.cons1.JavaAssignmentsRCC.Ass25112021;

/*      Create a class Result which extend from Test and implements interface
        Attendance with the following details:
        a. total
        methods are:
        a. putAttendance()      //implements interface (display atten)
        b. marksAdd()           //sub1+sub2+atten
        c. display()
        Create object of Result class and call the methods.
*/

public class Result extends Test{
    static Attendence atten = new Attendence();
    double total;

    public void getAttendence(int atten1){
        atten.getAttendence(atten1);
    }
    public void  putAttendance(){
        atten.putAttendance();
    }
    public void marksAdd(){
        total = sub1 + sub2;
    }
    public void display(){
        System.out.println("The total marks is : " + total);
    }
}
