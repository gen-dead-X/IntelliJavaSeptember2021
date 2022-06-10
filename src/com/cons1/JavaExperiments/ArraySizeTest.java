package com.cons1.JavaExperiments;
import java.util.*;

public class ArraySizeTest {
    public static void main(String[] args) {  //Experimenting with ArraySizeTest and found out empty spaces are being filled up by default values.
    /*    int arr[] = {0, 1 ,2, 3, 4, 5, 6, 7};
        int arr2[] = new int[10];
        for(int i : arr)
            arr2[i] = arr[i];

        for(int i : arr2)
            System.out.print(arr2[i] + " ");

        System.out.println();

     *//*   for(int i : arr)
            System.out.print(arr[i] + " ");*//*

        int i = 0;
        while( i < arr.length)
            System.out.print(arr[i++] + " "); */

        int has[] = {1, 1 , 1 , 1 , 2 , 3 , 4 , 4, 5 , 5 , 6};
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        while( i < has.length){
            if(map.containsKey(has[i]))
                map.put(has[i], map.get(has[i]) + 1);
            else
                map.put(has[i] , 1);
        }

    /*    for(int key : map.keySet())
            System.out.print(key + ": " + map.get(key) + "\n");*/
        System.out.println(List.of(map));
/*        for(Integer value: map.values())
            System.out.print(value + ": " + map.get(value) + "\n");*/

    }
}
