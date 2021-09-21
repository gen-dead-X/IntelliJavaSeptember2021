//Susmita Arora PG 518 12.3

public class BankAcc {
    protected String first_name;
    protected String last_name;
    protected String Address;
    protected int acc_no;
    protected int bal;

    BankAcc() {
        first_name = "";
        last_name = "";
        Address = "";
        acc_no = 0;
        bal = 0;
    }


    public int get_bal() {
        return bal;
    }

    public void deposit(int amount) {
        bal = bal + amount;
    }

    public void withdraw(int amount) {
        if (bal - amount < 1000) {
            System.out.println("Error : Balance cannot be less than Rs 1000 ");
        }
        else {
            bal = bal - amount;
        }
    }
    public void display(){
        System.out.print("Name : " + first_name + " " + last_name);
        System.out.print("\n");
    }
}
