package com.cons1.JavaAssignmentsRCC.Ass10112021.Program3;

/*3. In a particular factory a shift supervisor is a salaried employee who
supervises a shift. In addition to a salary, the shift supervisor earns a yearly
bonus when his or her shift meets production goals. Design a
ShiftSupervisor class that inherits from the Employee class. The
ShiftSupervisor class should have a field that holds the annual salary and a
field that holds the annual production bonus that a shift supervisor has
earned. Write one or more constructors for the class. Demonstrate the class
by writing a program that uses a ShiftSupervisor object.*/

public class Employee {
    String Name;
    String IdNumber;
    int shift;

    public Employee(String name, String idNumber, int shift) {
        Name = name;
        IdNumber = idNumber;
        this.shift = shift;
    }
}
