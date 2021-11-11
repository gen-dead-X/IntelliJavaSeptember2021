package com.cons1.JavaAssignmentsRCC.Ass10112021.Program5;

/*      Design a CruiseShip class that extends the Ship class. The CruiseShip class.
        should have the following members:
        ● A field for the maximum number of passengers (an int )
        ● A constructor
        ● A toString method that overrides the toString method in the base class.
        The CruiseShip class’s toString method should display only the ship’s name
        and the maximum number of passengers.*/

class CruiseShip extends Ship {
    int passengers;

    CruiseShip(int p, String n) {
        super(n, null);
        passengers = p;
    }

    public String toString() {
        System.out.println("Name of Ship: " + name);
        System.out.println("Maximum number of pasengers: " + passengers);
        return null;
    }
}
