public class susmita511_12_2_triangle extends susmita511_12_2 {
    susmita511_12_2_triangle() {
        super(3);
        System.out.println("---------Triangle---------");
        read_sides();
    }

    @Override
    void clacArea() {
        double s = (sides[0] + sides[1] + sides[2]);
        area = Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    void display() {
        System.out.println("---------Triangle Details---------");
        System.out.print("The length of the 3 sides are : " + sides[0] + " " + sides[1] + " " + sides[2]);
        clacArea();
        System.out.print("\nThe area is : " + area);
        System.out.println();
    }

//    public static void main(String[] args) {
//
//    }
}
