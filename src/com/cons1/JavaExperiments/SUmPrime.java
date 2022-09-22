package com.cons1.JavaExperiments;
import java.util.*;

public class SUmPrime {
    public static boolean isPrime(int n) {
        int c = 0;
        for(int i  = 1; i <=n ; i++ ){
            if(n % i == 0)
                 c++;
        }
        return c == 2;
    }
    public static long calculateSumOfPrime(List<Integer> inputArray) {
        int sum = 0;
        for(int i = 0; i < inputArray.size(); i++){
            if(isPrime(inputArray.get(i)) == true)
                sum += inputArray.get(i);
        }

        return sum;
    }
}
