package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OhMaaGoTuruLob {
    public static HashMap solution(String str) {

        HashMap<Character, Character> hMap = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    hMap.put('a', 'a');
                    break;
                case 'u':
                    hMap.put('u', 'u');
                    break;
                case 'i':
                    hMap.put('i', 'i');
                    break;
                case 'o':
                    hMap.put('o', 'o');
                    break;
                case 'e':
                    hMap.put('e', 'e');
                    break;
                case 'A':
                    hMap.put('A', 'A');
                    break;
                case 'U':
                    hMap.put('U', 'U');
                    break;
                case 'I':
                    hMap.put('I', 'I');
                    break;
                case 'O':
                    hMap.put('O', 'O');
                    break;
                case 'E':
                    hMap.put('E', 'E');
                    break;


            }
        }

        return hMap;

    }

    public static void main(String args[]) throws IOException {


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());
            ArrayList<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            ArrayList<Character> vowelListUpper = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
            while (testCases-- > 0) {

                String str = br.readLine();
                HashMap hMap = solution(str);

                if (hMap.keySet().containsAll(vowelList) || hMap.keySet().containsAll(vowelListUpper)) {
                    System.out.println("lovely string");
                } else {
                    System.out.println("ugly string");
                }
            }


        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
