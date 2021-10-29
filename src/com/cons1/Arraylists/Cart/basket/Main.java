package com.cons1.Arraylists.Cart.basket;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Basket myBasket = new Basket();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> myBasket.printBasket();
                case 2 -> addBasket();
                case 3 -> modifyBasket();
                case 4 -> removeBasket();
                case 5 -> searchBasket();
                case 6 -> quit = true;
            }
        }
    }

    public static void addBasket(){
        System.out.print("Enter the name of the item : ");
        myBasket.addBasket(sc.nextLine());
    }

    public static void removeBasket(){
        System.out.print("Enter the item number to remove : ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        myBasket.removeBasket(itemNo - 1);
    }

    public static void modifyBasket(){
        System.out.print("Enter the item number : ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the item to modify: ");
        String newItem = sc.nextLine();
        myBasket.modifyBasket(itemNo - 1 , newItem);
    }

    public static void searchBasket(){
        System.out.print("Enter the item name to search: ");
        String itemName = sc.nextLine();
        if(myBasket.findBasket(itemName) !=  null)
            System.out.println("Found " + itemName + " in our Basket!");
        else
            System.out.println("Not found!");
    }


    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the Basket.");
        System.out.println("\t 2 - To add an item to the Basket.");
        System.out.println("\t 3 - To modify an item in the Basket.");
        System.out.println("\t 4 - To remove an item from the Basket.");
        System.out.println("\t 5 - To search for an item in the Basket.");
        System.out.println("\t 6 - To quit the application.");
    }
}
