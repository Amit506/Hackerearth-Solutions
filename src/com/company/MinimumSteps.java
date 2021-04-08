package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumSteps {
    public static void main(String args[]) throws IOException {


        try {
            Scanner sc = new Scanner(System.in);
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
                int k = sc.nextInt();
                int m = sc.nextInt();
                int n = sc.nextInt();
                int count = 0;
                int x = 0;
                while (k < m) {
                    if (m % n == 0) {
                        m = m / n;
                        count++;
                    } else {
                        x = (n - (m % n));
                        m += (n - (m % n)) / 2 * 2 + (n - (m % n)) % 2;
                        count += x / 2 + x % 2;
                    }
                }
                if (k > m) {
                    count += (k - m) / 2 + (k - m) % 2;
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }


}
