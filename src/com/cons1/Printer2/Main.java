package com.cons1.Printer2;

public class Main {
    public static void main(String[] args) {

        Printer print = new Printer(15,"Laser Printer", "Yes");



        print.printPages();
        int a = print.getInkLevel();
        System.out.println(a);

    }
}
