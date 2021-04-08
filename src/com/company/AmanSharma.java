package com.company;

import java.util.Scanner;

public class AmanSharma {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int days = s.nextInt();
        long count = 0;
        while (days-- > 0) {
            int r = s.nextInt();
            int x = s.nextInt();

            if (700 * x >= 44 * r) {
                count++;
            }

        }
        System.out.println(count);


    }
}
