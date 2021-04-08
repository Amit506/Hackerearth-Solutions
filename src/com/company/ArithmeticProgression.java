package com.company;

import java.util.*;
import java.lang.*;

public class ArithmeticProgression {


    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

//                long d1 = b-a;
//                long d2 = c-b;
            if (b - a == c - b) {
                System.out.println(0);
                continue;
            }
            long d = Math.abs((c - b) - (b - a));
            if (d % 2 == 0) {
                System.out.println(d / 2);
            } else {
                System.out.println((d / 2) + 1);
            }

        }
    }

}
