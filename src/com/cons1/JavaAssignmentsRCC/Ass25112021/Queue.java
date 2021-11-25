package com.cons1.JavaAssignmentsRCC.Ass25112021;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    static ArrayList<String> new_list_says_Hi = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> quit = true;
                case 1 ->
//                    System.out.print("Enter the position to add : ");
//                    pos = sc.nextInt();
//                    sc.nextLine();
                    addElements();
                case 2 -> removeElements();
                case 3 -> display();
                case 4 -> printInstructions();
            }
        }

    }
    public static void addElements(){
//        for(int i = 0; i < queue.size(); i++ ){
//        }
        System.out.print("Enter the String to add : ");
        String string = sc.nextLine();
        sc.nextLine();
//        System.out.print("Enter the position to remove : ");
//        int pos = sc.nextInt();
//        sc.nextLine();
        new_list_says_Hi.add(string);

    }
    public static void removeElements(){
        System.out.print("Enter the String to remove : ");
        String string = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the position to remove : ");
        int pos = sc.nextInt();
        sc.nextLine();
        new_list_says_Hi.add(string);
        for(int i = 0; i <= pos; i++ ){
            if(i == pos)
                new_list_says_Hi.remove(string);
        }

    }
    public static void display(){
        for (int i = 0; i < new_list_says_Hi.size(); i++) {
            System.out.print((i+1) + ". " + new_list_says_Hi.get(i));
        }
    }
    public static void printInstructions(){
        System.out.println("Press 1 to add!");
        System.out.println("Press 2 to remove!");
        System.out.println("Press 3 to display!");
        System.out.println("Press 4 to Print Instructions!");
        System.out.println("Press 0 to Quit!");
    }
}
