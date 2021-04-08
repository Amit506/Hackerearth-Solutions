package com.company;

import java.io.IOException;
import java.util.Scanner;

public class BracketSequence {


    public static void main(String args[]) throws IOException {

        try {

            Scanner sc = new Scanner(System.in);
            char[] bracketArray = sc.next().toCharArray();
            int flag, c = 0, i, j, n = bracketArray.length;
            for (i = 0; i < n; i++) {
                flag = 0;
                if (bracketArray[i] == ')')
                    continue;
                for (j = i; j < i + n; j++) {
                    if (bracketArray[(j % n)] == '(')
                        flag++;
                    else
                        flag--;
                    if (flag < 0)
                        break;
                }
                if (flag == 0)
                    c++;
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
