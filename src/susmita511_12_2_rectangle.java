class susmita511_12_2_rectangle extends susmita511_12_2 {
    susmita511_12_2_rectangle() {
        super(2);
        System.out.println("________Rectangle_________");
        read_sides();
    }

    @Override
    void clacArea() {
        area = sides[0] * sides[1];
    }

    void display() {
        System.out.println("----------RectangleStats----------");
        System.out.print("Length of side 1 : " + sides[0]);
        System.out.print("\nLength of side 2 : " + sides[1]);
        clacArea();
        System.out.print("\nArea : " + area);
        System.out.println();
    }

//    public static void main(String[] args) {
//        susmita511_12_2_rectangle rec = new susmita511_12_2_rectangle();
//        rec.clacArea();
//        rec.display();
//    }
}
