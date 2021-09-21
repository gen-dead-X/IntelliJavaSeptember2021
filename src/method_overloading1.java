//Concepts of OOP : 1. Polymorphism    2. constructor    3. Objects

class method_overloading1 {

    int n1;
    int n2;
    String a1;
    String a2;
    int sum;

    method_overloading1(int a, int b, String c, String d) {
        n1 = a;
        n2 = b;
        a1 = c;
        a2 = d;
        sum = 0;
    }

    method_overloading1(){
        n1 = 0;
        n2 = 0;
        a1 = "";
        a2 = "";
        sum = 0;
    }

    void calc(){
        sum = n1 + n2;
    }

    void calc(int n){
        sum = n1 + n2 + n;
    }

    public void display(){

        System.out.print("Your First name is : " + a1 + "\n");
        System.out.print("Your Last name is : " + a2 + "\n");
        System.out.print("Your addition is : " + sum + "\n");

    }

    public void display(String address){

        System.out.print("Your First name is : " + a1 + "\n");
        System.out.print("Your Last name is : " + a2 + "\n");
        System.out.print("Your address is : " + address + "\n");
        System.out.print("Your addition is : " + sum + "\n");

    }

}

class psvm{
    public static void main(String[] args) {
        method_overloading1 ob1 = new method_overloading1(5 , 6 , "Nipa" , "Naskar");
        ob1.calc();
        ob1.display();

        method_overloading1 ob2 = new method_overloading1(5 , 6 , "Nipa" , "Naskar");
        ob2.calc(5);
        ob2.display("GhoshPur , South Garia");


    }
}