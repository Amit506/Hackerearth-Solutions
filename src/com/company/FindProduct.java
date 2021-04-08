package com.company;

import java.util.Scanner;

public class FindProduct {


    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        long result = 1;
        long mod = (long) Math.pow(10, 9) + 7;
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
            result = (result * array[i]) % mod;
        }
//        int answer=(int)(result%(Math.pow(10,9)+7));
        System.out.println(result);    // Writing output to STDOUT

    }
}
