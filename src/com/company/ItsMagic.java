package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ItsMagic {


    public static void main(String args[]) throws IOException {
        try {
//            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            long[] array = new long[n];

            long totalSum = 0;
            long result = -1;
            long tempC = 10000000;
            for (int i = 0; i < n; i++) {

                array[i] = sc.nextLong();
                totalSum = totalSum + array[i];

            }

            for (int i = 0; i < n; i++) {


                long temp = 0;

                temp = totalSum - array[i];
                if (temp % 7 == 0 && tempC > array[i]) {
                    tempC = array[i];

                    result = i;
                }
            }
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
