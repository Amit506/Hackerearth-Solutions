package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DigitCube {



   public static long nextSum(long n){
        long sum=0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
   }




    public  static  void  main(String args[])throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//            Scanner sc = new Scanner(System.in);
            int test=Integer.parseInt(br.readLine());
            while (test-->0){


              long result=0;
              String[]  l = br.readLine().split(" ");
                long base= Long.parseLong(l[0]);
                long k =  Long.parseLong(l[1]);


         for (int i=0;i<k;i++){
              long sum = nextSum(base);
              result= ((long) Math.pow(sum, 3));
              base=result;
         }

                System.out.println(result);
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
