package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers {
    public static boolean specialNo(int n) {
        boolean bool = true;
        while (n > 0) {

            int r = n % 10;
            if (r != 4 && r != 7) {
                bool = false;
                break;
            }
            n = n / 10;
        }
        return bool;
    }

    public static boolean coPrime(int a, int b) {
        int gcd = 1;
        int min, max;
        min = a;
        if (min > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        while (max > min) {
            int r = max % min;
            if (r == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = r;
            }
        }
        if (gcd == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(reader.readLine());

            int count = 0;

            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (specialNo(i) && specialNo(j) && coPrime(i, j)) {

                        count++;

                    }
                }

            }
            System.out.println(count);

        } catch (Exception e) {
            return;
        }
    }
}
