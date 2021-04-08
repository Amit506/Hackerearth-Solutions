package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfCycles {


    public static void main(String args[]) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            long q = Integer.parseInt(reader.readLine());

            while (q-- > 0) {
                long n = Integer.parseInt(reader.readLine());
                n++;
                long answer = n * n - 3 * n + 3;
                System.out.println(answer);
            }
        } catch (Exception e) {
            return;
        }


    }
}
