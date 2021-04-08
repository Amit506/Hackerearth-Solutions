package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TwoStrings {


    public static void main(String args[]) throws IOException {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            long testCases = Integer.parseInt(reader.readLine());
            List<Character> arrayList = new ArrayList<>();
            List<Character> arrayList2 = new ArrayList<>();
            while (testCases-- > 0) {
                String[] str = reader.readLine().split(" ");
                if (str[0].length() != str[1].length()) {
                    System.out.println("NO");
                } else {
                    for (int i = 0; i < str[1].length(); i++) {
                        arrayList.add(str[1].charAt(i));
                        arrayList2.add(str[0].charAt(i));
                    }
                    Collections.sort(arrayList);
                    Collections.sort(arrayList2);
//                     System.out.println(arrayList);
//                     System.out.println(arrayList2);
                    if (arrayList.equals(arrayList2)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO)");
                    }
                }
            }
        } catch (Exception e) {
            return;
        }
    }


}
