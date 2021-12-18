package com.cons1.DSA.HashTables_Maps;

import java.util.*;
import java.io.*;

public class HashTable_Java {
    public static void main(String[] args) {
//        Hashtable<String , String> hashtable = new Hashtable<>();
        Map<String, String> hashtable = new HashMap<>();
        hashtable.put("one. ", "Hey! ");
        hashtable.put("two. ", "This is ");
        hashtable.put("three. ", "Joy!");

        System.out.println(hashtable.get("one. "));
//        Set<String> keys = new hashtable.keySet();
//        Set<Map.Entry<String, String>> value = hashtable.entrySet();
        for( String key : hashtable.keySet()) {
            System.out.println(hashtable.get(key));
        }
    }
}
