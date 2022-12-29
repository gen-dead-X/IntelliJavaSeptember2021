package com.cons1.java_basics;

//Input :  JoYRudra Biswas
//Output : jOyrUDRA bISWAS
//

import java.util.Locale;
import java.util.Scanner;

public class caseSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = "JoYRudra Biswas";
        StringBuilder sen = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int asci = (int)ch; //extrinsic type conversion

            String sh = s.substring(i , i+1);   //   J  (String)

            if(asci >= 65 && asci <= 91){
                sen.append(sh.toLowerCase());
            }
            else if( asci >= 97 && asci <= 123){
                sen.append(sh.toUpperCase());
            }
            else
                sen.append(sh);
        }

        System.out.println(sen);
    }
}
