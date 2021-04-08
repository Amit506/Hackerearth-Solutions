package com.company;

import java.awt.image.ImagingOpException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimilarElements {

    public static void main(String args[]) throws IOException {
        try {

            Scanner sc = new Scanner(System.in);
            int arrayLength = sc.nextInt();
            int array[] = new int[arrayLength];
            int result = 0;
            int temp;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < arrayLength; i++) {
                array[i] = sc.nextInt();
            }
            for (int i = 0; i < arrayLength - 1; i++) {

                for (int j = i + 1; j < arrayLength; j++) {

                    if (array[i] == array[j] + 1 || array[i] + 1 == array[j]) {

                        result++;
                        map.put(i + 1, j + 1);


                    }


                }


            }
            for (int l = 1; l < array.length; l++) {
                if (map.containsKey(l)) {
                    int temp2 = map.get(l);
                    for (int n = l + 1; n < array.length + 1; n++) {
                        if (map.containsKey(n)) {
                            if (map.get(n) == temp2) {
//                        System.out.println("{"+l+"="+n+"}");
                                result++;
                            }
                        }

                    }
                }
            }
            for (int k : map.keySet()) {
                for (int m : map.values()) {
                    if (k == m) {
//                System.out.println("{"+k+"="+m+"}");
                        result++;
                    }
                }
            }


            System.out.println(result);
//    System.out.println(map);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
