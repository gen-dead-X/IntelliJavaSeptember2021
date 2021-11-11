package com.cons1.JavaAssignmentsRCC.Ass10112021.Program1;

public class Department extends College {

    String deptName;
    String hodName;

    public Department(String collegeName, String address , String deptName, String hodName) {
        super(collegeName, address);
        this.deptName = deptName;
        this.hodName = hodName;
    }

    void showDeptDetails(){
        System.out.println("Department Name : " + this.deptName);
        System.out.println("Hod Name : " + this.hodName);
    }
}
