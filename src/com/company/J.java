package com.company;


import java.util.Scanner;

class J {
    static boolean h(int n){
        boolean b =false;
        while (n>0) {
            if (n % 10 == 3)
            {   b = true;
            break;
        }
                n=n/10;
        }
        return  b;
    }
    public static  void main(String args[]){

    Scanner s = new Scanner(System.in);

        int n = s.nextInt();

    while (true) {
        n = n + 1;
        if (!J.h(n)&&!(n%3==0) ){
          break;

        }

    }
    System.out.println(n);


    }
}
