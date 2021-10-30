package com.cons1.Arraylists.Cart;

import java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    static Cart myCart = new Cart();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> myCart.printCart();
                case 2 -> addCart();
                case 3 -> modifyCart();
                case 4 -> removeCart();
                case 5 -> searchCart();
                case 6 -> quit = true;
                    
            }
        }
    }
    public static void addCart(){
        System.out.print("Please enter the cart item:  ");
        myCart.addCart(sc.nextLine());
    }

    public static void modifyCart(){
        System.out.print("Enter item number : ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the replacement item: ");
        String newItem = sc.nextLine();
        myCart.modifyCart(itemNo - 1 ,newItem);
    }

    public static void removeCart(){
        System.out.print("Enter item Number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        myCart.removeCart(itemNo - 1);
    }

    public static void searchCart(){
        System.out.print("enter item to search for : ");
        String searchItem = sc.nextLine();
        if(myCart.findItem(searchItem) != null)
            System.out.println("Found " + searchItem + " in our Cart");
        else
            System.out.println(searchItem + " not found in our Cart!");

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
}
