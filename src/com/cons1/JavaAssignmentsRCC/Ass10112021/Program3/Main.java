package com.cons1.JavaAssignmentsRCC.Ass10112021.Program3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee Name : ");
        String Name = sc.nextLine();
        System.out.print("Enter your IDNumber : ");
        String IdNo = sc.nextLine();
        System.out.print("Enter your Annual Salary : ");
        double AnnualSalary = sc.nextDouble();
        System.out.print("Enter your Production Bonus : ");
        double ProductionBonus = sc.nextDouble();
        System.out.print("Enter your Shift : ");
        int shift = sc.nextInt();

        ShiftSupervisor shiftSupervisor = new ShiftSupervisor(Name, IdNo, shift, ProductionBonus, AnnualSalary);
        shiftSupervisor.bonus();
        shiftSupervisor.display();
    }
}
