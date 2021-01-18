package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Zoos {
    public  static  void  main(String[] args) throws IOException{
       try {
           Scanner sc = new Scanner(System.in);

           String word = sc.next();
           char[] c = word.toCharArray();
           int x = 0;
           int y = 0;
           for (int i = 0; i < word.length(); i++) {
               if (c[i] == 'z') {
                   x++;
               } else {
                   y++;
               }
           }
           if (2 * x == y) {
               System.out.println("YES");
           } else {
               System.out.println("N0");
           }
       }
       catch (Exception e){
           return;
       }

    }
}
