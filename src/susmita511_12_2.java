import java.util.*;

public class susmita511_12_2 {
    int no_of_sides;
    double[] sides;
    double area;

    susmita511_12_2(int num) {
        no_of_sides = num;
        sides = new double[num];

    }

    void clacArea() {
        area = 0;
    }

    public void read_sides() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of sides : ");
        int side = sc.nextInt();
        for (int i = 0; i < no_of_sides; i++) {
            System.out.print("\nEnter the length of " + (i + 1) + " side : ");
            sides[i] = sc.nextDouble();
        }
        System.out.println();
    }
}

