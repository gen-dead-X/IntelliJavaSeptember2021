package com.cons1.JavaAss08102020;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        double vol1 = 0.0;
        double vol2 = 0.0;
        double vol3 = 0.0;

        Scanner sc = new Scanner(System.in);
        Program3 vol = new Program3();
        for(int i = 1 ; i <= 3 ; i++){
            System.out.print("\nEnter the width : ");
            int a = sc.nextInt();
            System.out.print("\nEnter the value of height :");
            int b = sc.nextInt();
            System.out.print("\nEnter the value of depth :");
            int c = sc.nextInt();

            if(i == 1)
                vol1 = vol.volume(a, b, c);
            else if(i == 2)
                vol2 = vol.volume(a, b, c);
            else
                vol3 = vol.volume(a, b, c);
        }

        double a = vol.compareVolume(vol1, vol2, vol3);

        System.out.print("\nThe Highest Vol is : " + a);

    }
}
