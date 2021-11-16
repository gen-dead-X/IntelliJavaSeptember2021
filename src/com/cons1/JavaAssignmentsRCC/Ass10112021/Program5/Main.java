package com.cons1.JavaAssignmentsRCC.Ass10112021.Program5;

/*      Demonstrate the classes in a program that has a Ship array. Assign various
        Ship , CruiseShip , and CargoShip objects to the array elements. The
        program should then step through the array, calling each object’s toString
        method.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {

        int num, opn;
        String n, y;
        int p, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of ships:");
        num = sc.nextInt();

        Ship arr[] = new Ship[num];
        boolean quit = false;
        int i = 0;
        while (!quit) {
            System.out.println("Enter type of ship-->0.Quit 1.Cruise 2.Cargo 3.Other: ");
            opn = sc.nextInt();
            switch (opn) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter name: ");
                    n = sc.next();
                    System.out.println("Enter passenger capcity: ");
                    p = sc.nextInt();
                    arr[i] = new CruiseShip(p, n);
                    i++;
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    n = sc.next();
                    System.out.println("Enter cargo capcity: ");
                    c = sc.nextInt();
                    arr[i] = new CargoShip(c, n);
                    i++;
                    break;
                case 3:
                    System.out.println("Enter name: ");
                    n = sc.next();
                    System.out.println("Enter manufacture year: ");
                    y = sc.next();
                    arr[i] = new Ship(n, y);
                    i++;
                    break;
                default:
                    System.out.println("Wrong choice. Please enter correct choice.");
            }
        }
        for (i = 0; i < num; i++) {
            System.out.println("\nDetails of Ship" + (i + 1));
            arr[i].toString();
        }
    }
}
