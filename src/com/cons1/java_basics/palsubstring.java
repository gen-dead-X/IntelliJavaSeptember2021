package com.cons1.java_basics;

public class palsubstring {

    public static boolean isPal(String n){
        String s ="";

        for(int i = n.length() - 1; i >= 0; i--) {
            s = s + n.charAt(i);
//            System.out.println(s);
        }

        if(s.equals(n))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isSub("sdabnitinbaio"));
    }

    public static int isSub(String s){ //sd abnitinba io

        String pal = "";

        int len = 0;
        int p1= 0, p2 = s.length();

        while (p1 <= p2) {
            String sub = s.substring(p1, p2);
            if (isPal(sub)) {
                if (sub.length() > len) {
                    len = sub.length();
                }
            }
            p1++;
            p2--;
        }
        return len;
    }
}
