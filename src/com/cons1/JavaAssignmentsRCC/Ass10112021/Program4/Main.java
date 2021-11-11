package com.cons1.JavaAssignmentsRCC.Ass10112021.Program4;

/*      Demonstrate the class by writing a program
        that uses a TeamLeader object.         */

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Team Leader : ");
        String Name = sc.nextLine();
        System.out.print("Number of members : ");
        int Member = sc.nextInt();
        System.out.print("Monthly Bonus : ");
        double Bonus = sc.nextDouble();
        System.out.print("Hours attended : ");
        int Attend = sc.nextInt();
        System.out.print("Hours required : ");
        int Required = sc.nextInt();

        TeamLeader team = new TeamLeader(Name , Member, Bonus,Attend, Required);

        team.CheckTime();
        team.display();
    }

}
