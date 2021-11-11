package com.cons1.JavaAssignmentsRCC.Ass10112021.Program3;

public class ShiftSupervisor extends Employee {

    double AnnualProductionBonus;
    double AnnualSalary;

    public ShiftSupervisor(String name, String idNumber, int shift, double AnnualProductionBonus , double annualSalary) {
        super(name, idNumber, shift);
        this.AnnualProductionBonus = AnnualProductionBonus;
        AnnualSalary = annualSalary;
    }

    void bonus() {
        if(shift > 7)
            this.AnnualSalary += AnnualProductionBonus;

    }

    void display(){
        System.out.println("Your Annual Salary is : " + this.AnnualSalary);
    }
}
