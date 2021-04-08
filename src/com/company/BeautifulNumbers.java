package com.company;

import java.io.IOException;
import java.util.Scanner;

public class BeautifulNumbers {


    static public boolean solve(long x, long k) {

        boolean bool = true;
        long temp = 0;
        while (x != 0) {
            if (x % k != 0) {
                x--;
                if (x % k != 0) {
                    bool = false;
                    break;
                }
            } else {
                x = x / k;
            }


        }


        return bool;
    }

    public static void main(String args[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            long testCases = sc.nextInt();
            while (testCases-- > 0) {
                long x = sc.nextLong();
                long k = sc.nextLong();
                boolean b = BeautifulNumbers.solve(x, k);
                if (b) {
                    System.out.println("Yes");
                } else
                    System.out.println("No");
            }

        } catch (Exception e) {
            return;
        }
    }
}
