package com.company;

import java.util.Scanner;

public class prime {
    public static  void  main(String[] args ){
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        boolean b = true;
        for (int i=2;i<n/2;i++){
            if (n%i==0){
                b= false;
                break;
            }
        }
        System.out.println(b);
    }
}
