package com.cons1.Arraylists.Mobile;

import java.util.Scanner;

public class MobilePhone {

    private static Contacts myContacts = new Contacts();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        int choice;
        printInstructions();

        while(!quit){
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0 -> printInstructions();
                case 1 -> myContacts.printContacts();
                case 2 -> addContacts();
                case 3 -> modifyContacts();
                case 4 -> removeContacts();
                case 5 -> searchContacts();
                case 6 -> quit = true;
            }
        }
    }

    public static void addContacts(){
        System.out.print("Enter the name and number of the Contact to add : ");
        myContacts.addContacts(sc.nextLine() , sc.nextLong());
    }

    public static void removeContacts(){
        System.out.print("Enter the contact name You want to remove : ");
        String contactName = sc.nextLine();
        myContacts.removeContacts(contactName);
    }

    public static void modifyContacts(){
        System.out.print("Enter the Contact name to modify: ");
        String oldName = sc.nextLine();
        System.out.print("Enter the new Name: ");
        String newName = sc.nextLine();
        System.out.print("Enter the New Number: ");
        long newNumber = sc.nextLong();
        sc.nextLine();
        myContacts.editContacts(oldName, newName , newNumber) ;
    }

//    public static void modifyContacts(){
//        System.out.print("Enter the Contact name to modify: ");
//        String oldName = sc.nextLine();
//        System.out.print("Enter the new Name: ");
//        String newName = sc.nextLine();
//        myContacts.editContacts(oldName, newName) ;
//    }

    public static void searchContacts(){
        System.out.print("Enter the Contact Name to search : ");
        String contactName = sc.nextLine();
        myContacts.searchContacts(contactName , 1);
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of Contacts.");
        System.out.println("\t 2 - To add a Contact.");
        System.out.println("\t 3 - To modify/edit a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }
}
