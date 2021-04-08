package com.company;

import java.io.IOException;
import java.util.Scanner;

public class CharSum {
    public int Weight(char character) {

        int weight = (int) character - 96;
        return weight;
    }

    public static void main(String[] args) throws IOException {
        try {

            Scanner s = new Scanner(System.in);
            String string = s.nextLine();
            int sum = 0;
            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);
                CharSum cs = new CharSum();
                sum = sum + cs.Weight(character);
            }
            System.out.println(sum);
        } catch (Exception e) {
            return;
        }

    }
}
