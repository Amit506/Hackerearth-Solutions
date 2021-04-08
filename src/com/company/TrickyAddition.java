package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TrickyAddition {
    public static void main(String args[]) throws Exception {

    try {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        sc.nextLine();
        while (test-- > 0) {
            String n= sc.nextLine();
            String m= sc.nextLine();
            int n1 = n.length();
            int n2 = m.length();
            int [] answer= new int[(n1>=n2)?n1+1:n2+1];
            int i;
            int carry =0;
            int flag=0;
            int num;
            if(n1>=n2){


                for ( i=0;i<n1;i++){

                    num=(i<n2)?((n.charAt(i)-'0')+(m.charAt(i)-'0') +carry):((n.charAt(i)-'0')+carry);
                    if (num<10){
                        carry=0;
                        flag=0;
                        answer[i]=num;
                    }else {
                        carry = num%10;
                        flag=1;
                        answer[i]=num/10;
                    }
                }
            }else {
                for ( i = 0; i < n2; i++) {

                    num = (i < n1) ? ((m.charAt(i) - '0') + (m.charAt(i) - '0') + carry) : ((m.charAt(i) - '0') + carry);
                    if (num < 10) {
                        carry = 0;
                        flag = 0;

                        answer[i] = num;
                    } else {
                        carry = num % 10;

                        flag = 1;

                        answer[i] = num / 10;
                    }
                }
            }
            for (int j=0;j<i;j++){
                System.out.print(answer[j]);

            }
            if (flag==1){
                System.out.print(carry);
            }
            System.out.println();
//            br.readLine();

        }
    }catch (Exception e){
        return;
    }

    }
}