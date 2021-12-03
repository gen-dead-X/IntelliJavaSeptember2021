package com.cons1.JavaAssignmentsRCC.Ass25112021;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Test test = new Test();
        Result result = new Result();

        student.getRoll(64);
        student.putRoll();

        test.getMarks(99.0 , 89.0);
        test.putMarks();

        result.getAttendence(44);
        result.putAttendance();
        result.marksAdd();
        result.display();
    }
}
