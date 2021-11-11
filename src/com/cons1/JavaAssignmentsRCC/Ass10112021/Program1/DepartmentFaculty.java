package com.cons1.JavaAssignmentsRCC.Ass10112021.Program1;

public class DepartmentFaculty extends College{
    String name;
    String experience;

    public DepartmentFaculty(String collegeName, String address, String name , String experience) {
        super(collegeName, address);
        this.name = name;
        this.experience = experience;
    }

    void showFacultyDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Experience : " + this.experience);
    }
}
