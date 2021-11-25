package com.cons1.JavaAssignmentsRCC.Ass10112021.Program1;

public class Main {
    public static void main(String[] args) {
        College college = new College("RCCIIT" , "Canal Road , Beliaghata , Kolkata");
        DepartmentFaculty departmentFaculty = new DepartmentFaculty("RCCIIT" , "", "Joyrdudra Biswas" , "22+ Years");
        Department department = new Department("RCCIIT" , "Canal Road , Beliaghata , Kolkata" , "Information Technology" , "Dr Soumili Mitra");

        college.showDetails();
        departmentFaculty.showFacultyDetails();
        department.showDeptDetails();
    }
}
