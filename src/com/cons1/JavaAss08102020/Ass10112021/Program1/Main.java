package com.cons1.JavaAss08102020.Ass10112021.Program1;

public class Main {
    public static void main(String[] args) {
        College college = new College("RCCIIT" , "Canal Road , Beliaghata , Kolkata");
        DepartmentFaculty departmentFaculty = new DepartmentFaculty("RCCIIT" , "", "Joyrdudra Biswas" , "22+ Years");
        Department department = new Department("RCCIIT" , "Canal Road , Beliaghata , Kolkata" , "Information Technology" , "DR Nipa Naskar");

        college.showDetails();
        departmentFaculty.showFacultyDetails();
        department.showDeptDetails();
    }
}
