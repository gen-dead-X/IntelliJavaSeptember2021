import java.util.*;

public class susmita511_12_2_square extends susmita511_12_2 {
    susmita511_12_2_square() {
        super(1);
        System.out.println("----------Square----------");
        read_sides();
    }

    @Override
    void clacArea() {
        area = sides[0] * sides[0];
    }

    void display() {
        System.out.println("-------Square Details-------");
        System.out.print("Length of the side : " + sides[0]);
        clacArea();
        System.out.println("\nThe area of the square : " + area);
        System.out.println();
    }

//    public static void main(String[] args) {
//        susmita511_12_2_square square = new susmita511_12_2_square();
//        square.clacArea();
//        square.display();
//    }
}
