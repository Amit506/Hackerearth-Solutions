package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiftQuery {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testcase = Integer.parseInt(br.readLine());
            int lift1 = 1;
            int lift2 = 7;
            while (testcase-- > 0) {
                int floor = Integer.parseInt(br.readLine());
                if (floor >= 0 && floor <= 7) {
                    int dif1 = floor - lift1;
                    int dif2 = lift2 - floor;
                    int a_dif1 = Math.abs(dif1);
                    int a_dif2 = Math.abs(dif2);
                    if (a_dif1 < a_dif2) {
                        System.out.println("A");
                        lift1 = floor;
                    }
                    if (a_dif1 > a_dif2) {
                        System.out.println("B");
                        lift2 = floor;
                    }
                    if (a_dif1 == a_dif2) {
                        System.out.println("A");
                        lift1 = floor;
                    }
                }
            }

        } catch (Exception e) {
            return;
        }
    }
}
