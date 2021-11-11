package com.cons1.JavaAssignmentsRCC.Ass10112021.Program2;

//        Next, write a class named ProductionWorker that inherits from the
//        Employee class. The ProductionWorker class should have fields to hold the
//        following information:
//        i) Shift (an integer)
//        ii) Hourly pay rate (a double)
//        The workday is divided into two shifts: day and night. The shift will be an
//        integer value representing the shift that the employee works. The day shift is
//        Department of Information Technology
//        RCC Institute of Information Technology
//        Canal South Road, Kolkata - 700015
//
//        shift 1 and the night shift is shift 2. Write one or more constructors for the
//        class. Demonstrate the classes by writing a program that uses a
//        ProductionWorker object.

public class ProductionWorker extends Employee{

    int Shift;
    Double HourlyPay;

    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, Double hourlyPay) {
        super(employeeName, employeeNumber, hireDate);
        Shift = shift;

        HourlyPay = hourlyPay;
    }

    void display() {

        super.display();

        if(Shift == 1)
            System.out.println("Day Shift!");
        else if(Shift == 2)
            System.out.println("Night Shift!");
        else
            System.out.println("Invalid Entry!");

        System.out.println("Your Hourly Pay is : " + HourlyPay);
    }
}
