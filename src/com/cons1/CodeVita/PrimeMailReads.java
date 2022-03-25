package com.cons1.CodeVita;
import java.util.*;

class PrimeMailReads {
    static ArrayList<Integer> emails = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Unread Emails : ");
        long email = sc.nextLong();

        for(int i = 0; i < email; i++){
            emails.add(i+1);
        }

//        primeremoval();
//        printList();
//        one_removal();
//        printList();

        int c = 1;
        for(int i = 1; i > 0 ; i++ ){
            primeremoval();
            one_removal();
//            if(i == 1)
//                printList();
//            printList();
            c++;
            if(emails.size() == 1)
                break;
        }
        System.out.println(c);
    }

    public static void primeremoval(){
//        printList();
        emails.add(0,-2);
        for(int i = 1; i < emails.size(); i++) {
            if (isprime(i) == 2 ) {
                emails.set(i, -1);
            }
        }
//        printList();
        emails.remove(0);
//        printList();

    }

    public static int isprime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                c++;
        }
//        System.out.println("c= " + c);
        return c;
    }

    public static void  one_removal(){
//        emails.add(-2);
//        for(int i = 0; emails.get(i) == -2 ; ) {
//            if (emails.get(i) == -1)
//                emails.remove(i);
//            else
//                i++;
//            if(emails.get(i) == -2);
//                break;
//        }
//        emails.remove(emails.size() - 1);
//        printList();
        Collections.sort(emails);
        for(int i = 0; i < emails.size(); ) {
//            emails.get(i);
            if(emails.get((i+1)) != -1) {
                break;
            }
            else
                emails.remove(i);
        }
        emails.remove(0);

    }

    public static void printList(){
        for(int i = 0; i < emails.size(); i++){
            System.out.print(emails.get(i) + " ");
        }
        System.out.println();
    }
}
