package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InnocentPeople {

    public static boolean even(int n) {
        boolean b = false;
        if (n % 2 == 0) {
            b = true;

        }
        return b;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String code = br.readLine();
        int sum = 0;
        boolean b = false;
        if (code.charAt(2) == 'A' || code.charAt(2) == 'E' || code.charAt(2) == 'I' || code.charAt(2) == 'O' || code.charAt(2) == 'U' || code.charAt(2) == 'Y') {
            b = false;
        } else {
            for (int i = 0; i < code.length() - 1; i = i + 1) {
                if (i != 2 && i != 6 && i + 1 != 2 && i + 1 != 6) {
                    sum = code.charAt(i) - '0' + code.charAt(i + 1) - '0';
                    if (even(sum)) {
                        b = true;
                    } else {

                        b = false;
                        break;
                    }
                }
            }
        }
        if (b) {
            System.out.println("valid");
        } else System.out.println("invalid");
    }
}
