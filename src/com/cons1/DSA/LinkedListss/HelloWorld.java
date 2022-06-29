package com.cons1.DSA.LinkedListss;

import java.util.LinkedList;
import java.util.ListIterator;


public class HelloWorld {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();

        list.add("Kalinarayanpur");
        list.add("Sohobhatro");
        list.add("Phulera");
        list.add("Varanasi");
        list.add("East Texas");
        list.add("Xuan Ho");
        list.add("Taiwan");

        ListIterator<String> i = list.listIterator();
        while (i.hasNext()) {
            System.out.println("The Place youre Vising is Currently : " + i.next());
        }
    }
}
