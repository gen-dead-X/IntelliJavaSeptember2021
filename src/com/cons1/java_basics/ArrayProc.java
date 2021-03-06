package com.cons1.java_basics;/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

class Main {
    public static int processArray(ArrayList<Integer> array) {
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
        for (int i = 0; i <array.size(); i++) {
            if ((array.get(i) % 10 == 6) && (array.get(i) > 48)) {
                array.set(i, -1);
            }
            else if (array.get(i) % 10 == 6) {
                array.set(i, -5);

            }
            else if (array.get(i) > 48) {
                array.set(i, -3);
            }
        }
        return array.size();
    }


    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(num);
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
