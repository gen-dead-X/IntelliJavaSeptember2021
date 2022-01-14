package com.cons1.SemesterExam5th;
/*
Create a super class, Student and two sub classes Undergrad and Graduate.
The super class Student should have the following data members:
name, ID, grade, age and address.The super class,
Student should have at least one method: boolean isPassed(double grade).
The purpose of the ispassed method is to take one parameter,
grade(value between 0-100) and check whether the grade has passed the requirement for passing a course.
In the Student class this method should be empty as an abstract method.The two subclasses,
Graduate and Undergrad,
will inherit all data members of the Student class and override the method isPassed.
For the Undergrad class, if the grade is above 80.0, then isPassed returns true,
otherwise it returns false. For the Graduate class, if the grad is above 80.0,
then isPassed returns true, otherwise it returns false.Create main class for three classes.
In main class, create one Graduate object and one Undergrad object. For each object,
provide a grade and display the results of the isPassed method.
Upload only output screen below
 */

public class Student {
    String name;
    String id_card;
    double grade;
    int age;
    String Address;

    public Student(String name, String id_card, double grade, int age, String address) {
        this.name = name;
        this.id_card = id_card;
        this.grade = grade;
        this.age = age;
        Address = address;
    }

    boolean isPassed(double grade){
        if(grade > 80.0)
            return true;
        else
            return false;
    }
}
