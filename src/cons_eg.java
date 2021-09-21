public class cons_eg {

    int n1;
    int n2;

    cons_eg(int num) {
        n1 = num;
    }

    cons_eg() {
        n1 = 0;
        n2 = 0;
    }

    cons_eg(double d) {
        n1 = (int) d;
    }

}

class object_demo {
    public static void main(String[] args) {

        cons_eg ob = new cons_eg(8);
        cons_eg ob2 = new cons_eg();
        cons_eg ob3 = new cons_eg(8.8);

        System.out.println(ob.n1);
        System.out.println(ob2.n1);
        System.out.println(ob3.n1);


    }


}
