package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayUpdate {


    public static void main(String args[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int testCases = sc.nextInt();

            while (testCases-- > 0) {
                int arrayLength = sc.nextInt();
                int k = sc.nextInt();
                int array[] = new int[arrayLength];
                int lowestValue = 0;
                int result = 0;
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = sc.nextInt();
                }
                Arrays.sort(
                        array
                );

                lowestValue = array[0];

                if (lowestValue < k) {
                    while (lowestValue < k) {
                        result++;

                        lowestValue++;


                    }
                } else {
                    result = 0;
                }

                System.out.println(result);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
