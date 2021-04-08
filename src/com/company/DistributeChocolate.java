package com.company;

import java.util.Scanner;

public class DistributeChocolate {


    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                double c = sc.nextDouble();
                double n = sc.nextDouble();
                double minimumRequiredChocolate = (n * (n + 1) / 2);
                if (minimumRequiredChocolate > c) {
                    int result = (int) Math.round(c);
                    System.out.println(result);

                } else {
                    double doubleResult = (c - minimumRequiredChocolate) % n;
                    int result = (int) Math.round(doubleResult);
                    System.out.println(result);

                }


            }
        } catch (Exception e) {
            return;
        }
    }
}
