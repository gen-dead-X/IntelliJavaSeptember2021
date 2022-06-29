package com.cons1.DSA.LinkedListss;

import java.util.LinkedList;

public class GFGHEelp {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List : ");

        LinkedList<String> list = new LinkedList();

        list.add("Sobhabazar Sutanoti");
        list.add("EsPlanade");
        list.add("Kabi Subhas");
        list.add("Belgachia");
        list.add("EsPlanade");
        list.add("Mastar Da Surjo Sen");



        list.add(4,"Kalighat");

        list.removeFirst();
        list.removeLast();
        list.removeFirstOccurrence("EsPlanade");


//        for(list.size())
        System.out.println(list);
    }


}
