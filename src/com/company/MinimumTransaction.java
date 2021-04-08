package com.company;

import java.io.IOException;
import java.util.Scanner;

public class MinimumTransaction {


    public static Scanner in = new Scanner(System.in);

    public static void main(String args[]) throws IOException {
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < m; i++) {
            int v = in.nextInt();
            int u = in.nextInt();
            long w = in.nextLong();

            arr[v - 1] += w;
            arr[u - 1] -= w;
        }
        long minTransaction = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                minTransaction += arr[i];
            }
        }
        System.out.println(minTransaction);
    }
}
