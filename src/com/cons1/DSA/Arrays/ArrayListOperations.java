package com.cons1.DSA.Arrays;

import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        array.remove(2);
        array.add(3, 2);

        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " " );
        }
    }
}
