package com.cons1.JavaExperiments;

public class ImncomeTax {
    public static double IncomeTax(double it) {

        double tax = 0;
        if (it <= 250000)
            tax = 0;
        else if (it <= 500000)
            tax = 0.05 * (it - 250000);
        else if (it <= 750000)
            tax = (0.1 * (it - 500000)) + (0.05 * 250000);
        else if (it <= 1000000)
            tax = (0.15 * (it - 750000)) + 0.1 * (it - 500000) + (0.05 * 250000);
       else if (it <= 1250000)
            tax = 0.20 * (it - 1000000) + (0.15 * (it - 750000)) + 0.1 * (it - 500000) + (0.05 * 250000);
        else if (it <= 1500000)
            tax = 0.25* (it - 1250000) + 0.20 * (it - 1000000) + (0.15 * (it - 750000)) + 0.1 * (it - 500000) + (0.05 * 250000);
        else
            tax =0.30 * (it -  1500000 ) + 0.25* (it - 1250000) + 0.20 * (it - 1000000) + (0.15 * (it - 750000)) + 0.1 * (it - 500000) + (0.05 * 250000);

        double sur = 0;
        if(it > 50 * 100000 && it < 100 * 100000 )
            sur = 0.1 * it;
        else if(it > 100 * 100000 && it < 200 * 100000)
            sur = 1.15 * it;

        return tax;
    }

    public static void main(String[] args) {
        System.out.println(IncomeTax(1100000));
    }
}
