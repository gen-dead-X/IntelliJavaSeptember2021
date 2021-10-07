package com.cons1.Printer2;

public class Printer {

    private int pages_printed;
    private int ink_level;
    String printer_type;
    String isColor;

    public Printer(int pages_printed, String printer_type, String isColor) {
        this.pages_printed = pages_printed;
        this.ink_level = 100;
        this.printer_type = printer_type;
        this.isColor = isColor;
    }

    public int getInkLevel(){
        this.ink_level = this.ink_level - 5;
        return this.ink_level;
    }

    public  void printPages(){
        System.out.println(this.pages_printed + " Page(s) Printed!");
    }
}
