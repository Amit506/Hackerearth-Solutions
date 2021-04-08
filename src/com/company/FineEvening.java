package com.company;

import java.io.IOException;
import java.util.Scanner;

public class FineEvening {


    public static void main(String args[]) throws IOException {


        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int days = 0;
            int extra = 0;
            int temp = 1;
            int totalFlower = 1;
            int pond1flower = 0;
            if (k <= n) {
                extra = 2;
                while (totalFlower <= n) {
                    totalFlower = totalFlower * 2;
//                    System.out.println(totalFlower);
                    if (totalFlower < n) {
                        days++;
                    }
                }
            } else {
                while (pond1flower <= k) {
                    extra = extra + 2;
                    while (totalFlower <= n) {
                        totalFlower = totalFlower * 2;
//                       System.out.println(totalFlower);
                        if (totalFlower <= n) {
                            days++;
                        }
                    }
                    totalFlower = totalFlower / 2;
                    pond1flower = pond1flower + totalFlower;
                    temp = k - totalFlower;
                    totalFlower = 1;
                    while (totalFlower < temp) {
                        totalFlower = totalFlower * 2;
//                       System.out.println(totalFlower);
                        pond1flower = pond1flower + totalFlower;
                        if (totalFlower <= n) {
                            days++;
                        }
                    }
                }


            }
            System.out.println(days + extra);
        }
    }
}
