package com.cons1.JavaAss08102020;

/*Create a class Person having name and age of a Person as data members.
 Write a method that compare two persons by their age and print the
 person’s name and age who is senior most.*/

import java.util.Scanner;

public class Program4 {

    int Name;
    int Age;

    static int calcSenior(int age1, int age2){
        int flag = 0;
        if(age1 > age2)
            flag = 1;
        return  flag;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Person 1 : ");
        String name1 = sc.nextLine();
        System.out.println("Enter the age of person 1 : ");
        int age1 = sc.nextInt();

        System.out.println("Enter the name of Person 2 : ");
        String name = sc.nextLine();
        System.out.println("Enter the age of person 2 : ");
        int age2 = sc.nextInt();

        int flag = calcSenior(age1, age2);

        if( flag == 1)
            System.out.println("Person 1 name : " + name1 + " is senior with an age of " + age1);
        else
            System.out.println("Person 1 name : " + name + " is senior with an age of " + age2);

    }

}
