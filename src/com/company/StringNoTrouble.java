package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringNoTrouble {

    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int count = 0;
            int result = 0;
            for (int i = 0; i < str.length() - 1; i++) {

                char ch1 = str.charAt(i);
                char ch2 = str.charAt(i + 1);
                if (ch1 != ch2) {
                    count++;

                    if (result < count) {
                        result = count;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(result + 1);
        } catch (Exception e) {
            return;
        }

    }
}
