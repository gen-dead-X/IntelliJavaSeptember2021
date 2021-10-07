package com.cons1.printer;

public class Printer {
    static private int toner_level;
    private int printed_pages;
    private String duplex;
    static int totalPages;

    public Printer(String duplex) {
        toner_level = 100;
        this.printed_pages = 0;
        this.duplex = duplex;
        totalPages = 0;
    }

    public void Toner_level(int printed_pages){
        toner_level = toner_level - printed_pages;
    }

    public void Printed_pages(int printed_pages){

        Toner_level(printed_pages);

        if (toner_level > 0) {
            totalPages += printed_pages;
            //System.out.println(printed_pages + " pages are printed! ");
            System.out.println(printed_pages + " pages are printed!Total no of pages Printed : " + totalPages);
        }
        else {
            System.out.println("Ink Level empty! Can't Print Pages !");
        }
    }
}

