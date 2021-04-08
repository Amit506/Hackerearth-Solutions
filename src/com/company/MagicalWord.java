package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MagicalWord {


    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = ob.nextInt();
            String s = ob.next();
            String w = magic(s);
            System.out.println(w);
        }
    }

    static String magic(String s) {
        int l = s.length();
        String w = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = magic_letter(s.charAt(i));
            w += c;
        }
        return w;
    }

    static char magic_letter(char c) {
        int x = c;
        int diff = 255;
        int p = 67;
        int a[] = {67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - c) < diff) {
                diff = (int) (Math.abs(a[i] - c));
                p = a[i];
            }
        }
        return (char) (p);
    }
}