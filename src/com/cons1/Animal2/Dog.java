package com.cons1.Animal2;

public class Dog extends Animal2 {
    String breed;
    String color;

    public Dog(String type, String name, String breed, String color) {
        super(type, name, "yes", 4, 2);
        this.breed = breed;
        this.color = color;
    }

    void display() {
        System.out.println(type + " " + name + " " + breed + " " + color + " " + tail + " " + legs + " " + eyes);
    }

    @Override
    public void can_fight(int attack) {
        super.can_fight(attack);
    }

    public void can_fight(double attack) {
        System.out.println("can_fight() is called! (Sub)");
        System.out.println("damage potential : " + attack * 2.5);
    }

}