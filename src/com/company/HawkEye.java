package com.company;

import java.io.IOException;
import java.util.Scanner;

public class HawkEye {

    public  static  void  main(String[] args)throws IOException {
      try{
          Scanner sc = new Scanner(System.in);
          int s = sc.nextInt();
          int i = sc.nextInt();
          int j = sc.nextInt();
          int p = sc.nextInt();
          int [][] twoD_arr = new int [s][s];
          for(int k=0;k<s;k++){
              for(int l=0;l<s;l++){
                  int temp = p-Math.max(Math.abs(i-k),Math.abs(j-l));
                  if(temp<0){
                      System.out.print("0 ");
                  }else {
                      System.out.print(temp+" ");
                  }


              }
              System.out.println();
          }
      }catch (Exception e){
          return;
      }
    }
}
