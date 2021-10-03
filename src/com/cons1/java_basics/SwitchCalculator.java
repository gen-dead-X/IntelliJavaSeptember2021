package com.cons1.java_basics;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Calculator-------------");
        System.out.println("--------Press 1 for Addition--------");
        System.out.println("-------Press 2 for Subtraction------");
        System.out.println("-----Press 3 for Multiplication-----");
        System.out.println("--------Press 4 for Division--------");
        System.out.print("Enter your Choice -> ");

        int ch = sc.nextInt();
        int num1, num2;

        switch (ch) {
            case 1 -> {
                System.out.println("--------Addition--------");
                System.out.println("Enter the Two Numbers");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(num1 + num2);
            }
            case 2 -> {
                System.out.println("--------Subtraction--------");
                System.out.println("Enter the Two Numbers");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(num1 - num2);
            }
            case 3 -> {
                System.out.println("--------Multiplication--------");
                System.out.println("Enter the Two Numbers");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(num1 * num2);
            }
            case 4 -> {
                System.out.println("--------Division--------");
                System.out.println("Enter the Two Numbers");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(num1 / num2);
            }
            default -> System.out.println("-------------Invalid Entry-----------");
        }
    }
}
