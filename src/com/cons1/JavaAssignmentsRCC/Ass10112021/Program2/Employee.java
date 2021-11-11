package com.cons1.JavaAssignmentsRCC.Ass10112021.Program2;

//2. Employee and ProductionWorker Classes:
//        Design a class named Employee. The class should keep the following information in fields:
//        i) Employee name
//        ii) Employee number in the format XXX-L, where each X is a
//        digit within the range 0-9 and the L is a letter within the range
//        A-M.
//        iii) Hire date.
//        Write one or more constructors for the class.

public class Employee {

    String EmployeeName;
    String EmployeeNumber;
    String HireDate;

    public Employee(String employeeName, String employeeNumber, String hireDate) {
        EmployeeName = employeeName;
        EmployeeNumber = employeeNumber;
        HireDate = hireDate;
    }

    void display(){
        System.out.println("Employee name : " + EmployeeName);
        System.out.println("EmployeeNumber : " + EmployeeNumber);
        System.out.println("Hire Date : " + HireDate );
    }
}
