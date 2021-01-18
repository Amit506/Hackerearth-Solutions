package com.company;

import java.util.Scanner;

public class CountDivisor {


  public int countDivisible(int l,int m , int k){
      int result =0;
      for(int i=l;i<=m;i++){
          if(i%k==0){
              result++;

          }
      }


      return result;
  }

    public static void main(String[]args ){

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        CountDivisor countDivisor = new CountDivisor();
        int counts = countDivisor.countDivisible(l,m,k);
        System.out.println(counts);



    }
}
