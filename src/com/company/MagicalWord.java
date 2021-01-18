package com.company;

import java.util.Scanner;

public class MagicalWord{
    public boolean primen(int n){
        boolean b = true;
        for (int i=2;i<n/2;i++){
            if (n%i==0){
                b= false;
                break;
            }
        }
        return b;
    }

    public int nearestprime(int  n){
    boolean b = false;
    int c =0;
        for (int i=0;i<26;i++){
                    if (primen(n - i) && primen(n + i)) {
                      b=true;
                      c = n-i;
                      break;
                    }
                  else   if (primen(n - i)) {
                       b=true;
                        c = n-i;
                       break;
                    }
                  else   if (primen(n + i)) {
                       b=true;
                        c = n+i;
                        break;
                    }
                  c++;
                }
        if (b){
            return c;
        }
        return nearestprime(c+n);
    }
    public char primechar(int result){
        char c = (char)result;
        return c;
    }
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        MagicalWord m = new MagicalWord();
        StringBuilder str = new StringBuilder();
        while (testcase-- >0){
         String word = sc.nextLine();
         for (int i=0;i<word.length();i++){
             int n = (int) word.charAt(i);
             int result = m.nearestprime(n);
             char c = m.primechar(result);
             str.append(c);

         }
            System.out.println(str);
        }
    }
}