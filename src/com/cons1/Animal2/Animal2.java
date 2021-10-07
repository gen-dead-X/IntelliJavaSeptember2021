 package com.cons1.Animal2;

class Animal2 {
      String type;
      String name;
      String tail;
      int legs;
      int eyes;

    public Animal2(String type, String name, String tail, int legs, int eyes) {
        this.type = type;
        this.name = name;
        this.tail = tail;
        this.legs = legs;
        this.eyes = eyes;
    }

    public void can_fight(int attack){
        System.out.println("can_fight() is called! (Super)");
        System.out.println("damage potential : " + attack * 3 );
    }

    void can_move(int speed){
        System.out.println("can_move() is called!");
    }

}

