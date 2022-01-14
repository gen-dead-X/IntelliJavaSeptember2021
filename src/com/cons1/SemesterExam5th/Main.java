package com.cons1.SemesterExam5th;

/*
In main class, create one Graduate object and one Undergrad object. For each object,
provide a grade and display the results of the isPassed method.
Upload only output screen below
 */

public class Main {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("Joyrudra Biswas", "QEWI057", 90.4, 20, "Krishnanagar, Nadia");
        graduate.display();
        boolean grad = graduate.isPassed(90.4);
        if(grad == true)
            System.out.println("Passed!");
        else
            System.out.println("Not Passed!");


        System.out.println();

        Undergrad undergrad = new Undergrad("Tisasha Biswas", "QEWI557", 58.4, 19, "Kalyani, Nadia");
        undergrad.display();
        boolean udergrad = undergrad.isPassed(50.4);
        if(udergrad == true)
            System.out.println("Passed!");
        else
            System.out.println("Not Passed!");
    }
}
