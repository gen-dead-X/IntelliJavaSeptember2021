package com.cons1.JavaAssignmentsRCC.Ass08102021;

/*3. Create a class Box with three instance variables:
        a. width : int
        b. height : int
        c. depth : int
        and three methods:
        i. volume(): double
        ii. display(): void
        iii. compareVolume (Box, Box): Box
        Create three instances of Box class and display the details of the object
        with highest volume.*/

public class Program3 {

    int width;
    int height;
    int depth;

    public double volume(double width, double height , double depth){

        this.width = (int)width;
        this.height = (int)height;
        this.depth = (int)depth;

        return (this.depth * this.height * this.width);
    }

    void display(int a){
        System.out.print("\nVolume of the" + a + "box is : ");
    }

    public double compareVolume(double a , double b , double c){
        double max = 0;
        if(a > b && a > c){
            max = a;
        }
        else if(b > a && b > c)
            max = b;
        else
            max = c;

        return max;
    }

}
