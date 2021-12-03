package com.cons1.JavaAssignmentsRCC.Ass25112021;

/*Create interface Attendance with the following details:
        a. Atten
        method: putAttendance()
        */

public class Attendence {
    int Atten;

    public void getAttendence(int Atten){
        this.Atten = Atten;
    }

    public void putAttendance(){
        System.out.println("Your Attendance is : " + this.Atten);
    }
}
