package com.cons1.JavaAss08102020;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your ID Number : ");
        int ID_no = sc.nextInt();
        System.out.print("Enter your hourly rate : ");
        double hourly_rate = sc.nextDouble();
        System.out.print("Enter the no of hours worked : ");
        int hours_worked = sc.nextInt();

        Program9 gpay = new Program9(name, ID_no, hourly_rate, hours_worked);

        gpay.getGross_pay();

        System.out.println("Your Gross pay is : " + gpay.gross_pay);
    }
}
