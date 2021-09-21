package com.cons1.Animal;

import java.sql.SQLOutput;

public class Animal {
    String species;
    String name;
    int eyes;
    int tail;
    int body;

    public Animal(String species, String name, int eyes, int tail, int body) {
        this.species = species;
        this.name = name;
        this.eyes = eyes;
        this.tail = tail;
        this.body = body;
    }

    public void can_move(int speed){
        System.out.println("can_move() is called(Super). Move speed is : " + speed);
    }
    public  void can_hunt(int attack){
        System.out.println("can_hunt() is called.");
        System.out.println("Damage Potential : " + 3*attack);
    }
}

