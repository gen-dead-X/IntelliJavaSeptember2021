package com.cons1.JavaAss08102020;

//9. Design a Payroll class that has fields for an employee’s name, ID number,
//        hourly pay rate and number of hours worked. Write the appropriate
//        constructor that accept the employee’s name and ID number as
//        arguments. The class should also have a method that returns the
//        employee’s gross pay, which is calculated as the number of hours worked
//        multiplied by the hourly pay rate. Write a program that demonstrates the
//        class by creating a Payroll object, then asking the user to enter the data
//        for an employee. The program should display the amount of gross pay
//        earned.

public class Program9 {

    String Emp_name;
    int ID_no;
    double hourly_rate;
    int hours;
    double gross_pay;

    public Program9(String emp_name, int ID_no, double hourly_rate, int hours) {
        Emp_name = emp_name;
        this.ID_no = ID_no;
        this.hourly_rate = hourly_rate;
        this.hours = hours;
        this.gross_pay = 0;
    }

    public double getGross_pay() {
        gross_pay = hours * hourly_rate;
        return gross_pay;
    }
}
