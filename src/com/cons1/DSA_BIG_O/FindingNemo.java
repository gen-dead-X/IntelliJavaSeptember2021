package com.cons1.DSA_BIG_O;

public class FindingNemo {
    public static void main(String[] args) {
        String arr[] = {"dory" , "nipa" , "hat" , "lathi" , "nemo"  };

        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("nemo"))
                System.out.println("Found Nemo at position " + i);
        }
    }

}
