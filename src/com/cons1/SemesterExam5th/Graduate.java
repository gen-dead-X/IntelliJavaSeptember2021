package com.cons1.SemesterExam5th;

public class Graduate extends Student{

    public Graduate(String name, String id_card, double grade, int age, String address) {
        super(name, id_card, grade, age, address);
    }

    boolean isPassed(double grade){
        if (grade > 80.0)
            return true;
        else
            return false;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Id No : " + id_card);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
        System.out.println("Address : " + Address);

    }
}

