package com.company;

import java.util.Scanner;

public class MaxMinMax {
    private int n;

    public MaxMinMax(int n) {
        this.n = n;
        matrix(this.n);
    }

    void matrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
                if (j == n) {
                    System.out.println(" ");
                }
            }

        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            MaxMinMax m = new MaxMinMax(n);
        } catch (Exception e) {
            return;
        }
    }
}


