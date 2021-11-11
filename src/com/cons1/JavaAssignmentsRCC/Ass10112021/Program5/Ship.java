package com.cons1.JavaAssignmentsRCC.Ass10112021.Program5;

        /*Design a Ship class that the following members:
        ● A field for the name of the ship (a string).
        ● A field for the year that the ship was built (a string).
        ● A constructor.
        ● A toString method that displays the ship’s name and the year it was
        built.*/

class Ship {
    String name;
    String year;

    Ship(String n, String y) {
        name = n;
        year = y;
    }

    public String toString() {
        System.out.println("Name of Ship: " + name);
        System.out.println("Year it was manufactured: " + year);
        return null;
    }
}
