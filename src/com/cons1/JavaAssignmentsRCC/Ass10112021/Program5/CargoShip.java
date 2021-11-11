package com.cons1.JavaAssignmentsRCC.Ass10112021.Program5;

//        Design a CargoShip class that extends the Ship class. The CargoShip class
//        should have the following members:
//        ● A field for the cargo capacity in tonnage (an int )
//        ● A constructor
//        ● A toString method that overrides the toString method in the base class.
//        The CargoShip class’s toString method should display only the ship’s name
//        and the ship’s cargo capacity.

class CargoShip extends Ship {
    int cap;

    CargoShip(int c, String n) {
        super(n, null);
        cap = c;
    }

    public String toString() {
        System.out.println("Name of Ship: " + name);
        System.out.println("Cargo capacity of Ship: " + cap);
        return null;
    }
}
