package com.cons1.Animal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog my_dog = new Dog("Dog" , "JOY" , "Golden Retriever" ,"Golden");
        Dog my_dog2 = new Dog("Dog" , "NIPA" , "Neri" ,"Fakase Kalo");

//        my_dog.display();
//        my_dog2.display();

        my_dog.can_fight(3);
        my_dog2.can_fight(4.0);
        my_dog2.can_fight(4);

    }

}
