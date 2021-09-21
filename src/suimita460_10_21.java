import java.util.*;

public class suimita460_10_21 {
    long n;
    float S;
    float k;
    suimita460_10_21(){
        n = 0;
        S = 0.0f;
        k = 0.0f;
    }
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of S : ");
        try{
            S = sc.nextFloat();
        }
        catch (Exception e) {
        }
    }
    public long fact(long x){
        long fact = 0;
        for(int i = 1 ; i <= x ; i ++){
            fact *= i;
        }
        return fact;
    }
    public void disp(){
        for(int i = 1 ; i < 1000 ; i ++){
            long num = 2 , d = fact(i);
            float s = 0.0f;
            for (int j = 1 ; j < n ; j++){
                s  += num/d;
            }
            if(s >= S){
                System.out.println("The least value of n for which 2.0 < " + S + " < 7.0 is n = " + n);
                return ;
            }
        }
    }

    public static void main(String[] args) {
        suimita460_10_21 ob = new suimita460_10_21();
        ob.accept();
        ob.disp();
    }

}

