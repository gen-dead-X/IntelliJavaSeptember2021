package com.cons1.java_basics;
import java.util.*;
public class KeithNumber {
    static ArrayList<Integer> keith = new ArrayList<Integer>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Keith Number : ");
        int num = sc.nextInt();
        isKeith(num);
    }
    public static void isKeith(int num){
        int i = 1;
        makearr(num);
        while(i > 0){
            int sum = addarr();
//            printlist();
            if(sum == num){
                i = -1;
                System.out.println("Keith Number!");
                break;
            }
            else if(sum < num){
                keith.remove(0);
                keith.add(sum);
            }
            else{
                System.out.println("Not a Keith Number!");
                break;
            }
        }
    }
    public static int count(int num){
        int c = 0;
        for(int i = num; i > 0 ; i/=10)
            c++;
        return c;
    }
    public static int addarr(){
        int sum = 0;
        for(int i = 0; i < keith.size(); i++)
            sum += keith.get(i);
        return sum;
    }
    public static void makearr(int num){
        int c = count(num) - 1;
        int n = num;
        for(int i = 0; i < count(num); i++) {
            int rem =  n / (int) Math.pow(10, c);
            keith.add(rem);
            n = n %  (int) Math.pow(10, c--);
//            System.out.print(keith.get(i) + " ");
        }
//        System.out.println();
    }

    public static void printlist(){
        for(int i = 0; i< keith.size(); i++)
            System.out.print(keith.get(i) + " ");
        System.out.println();
    }
}
