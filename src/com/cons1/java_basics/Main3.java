package com.cons1.java_basics;

/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

public class Main3 {
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
        int new_length = array.size();
        int last_known = 0;
        for (int i = 0; i < new_length - 2; i++) {

            int rem = array.get(i) % 10;
            int rem2 = array.get(i + 1) % 10;

            if ((rem == 6) && (rem2 == 6)) {
                last_known = array.get(i + 1);
                array.set(i, -1);
                array.set(i + 1, -1);
                i++;
            }
            else if (rem == 6 && (last_known % 10 == 6)) {
                last_known = array.get(i + 1);
                array.set(i + 1, -1);
                i++;
            }


        }
        return array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for (int i = 0; i < new_length; i++) {
            if (arrayList.get(i) == -1) {
                continue;
            }
            System.out.println(arrayList.get(i));
        }
    }
}