/* Save this in a file called Main.java to compile and test it */
package com.cons1.java_basics;
import java.util.*;
import java.io.*;

public class Main2 {
    public static int processArray(ArrayList<Integer> arr) {
        int i,f=0;
        for(i=0;i<arr.size();i++){
            if(f==2){
                arr.set(i-2,-1);
                for(int j=i-1;j<arr.size();j++){
                    if(arr.get(j)%10!=6){
                        i=j;
                        f=0;
                        break;

                    }
                    arr.set(j,-1);
                }
            }
            else if(arr.get(i)%10!=6){
                f=0;
            }
            else if(arr.get(i)%10==6){
                f++;
            }

        }
        if(f==2){
            for(int j=i-2;j<arr.size();j++){
                arr.set(j,-1);
            }
        }
        /*
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the size of the
         * array.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        return arr.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++){
            if(arrayList.get(i)==-1){
                continue;
            }
            System.out.println(arrayList.get(i));
        }
    }
}