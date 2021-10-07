package com.cons1.printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_Pages = 0;

        Printer print = new Printer("NO");
//        System.out.print("Enter the Number of pages you want to print : " );

//        int pages = sc.nextInt();

        print.Printed_pages(15);

        print.Printed_pages(4);

        print.Printed_pages(21);

        print.Printed_pages(100);

//        for(int i = 1 ; i <= pages ; i++ ){
//            print.Printed_pages(i);
//            total_Pages++;
//            System.out.println("Total pages Printed : " + total_Pages);
//        }


    }
}
