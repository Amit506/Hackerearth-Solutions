package com.company;



import java.io.IOException;
import java.util.Scanner;

public class RainSound {

    public static void main(String[] args)throws IOException {
      try {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while (t-- > 0) {
              int min = 0;
              int max = 0;
              int l = sc.nextInt();
              int r = sc.nextInt();
              int s = sc.nextInt();

              l= (l-1)/s +1;
              r = r/s;
              if (l > r) {
                  System.out.println("-1 -1");
              }else {
                  System.out.println(l+" "+r);
              }
          }
      }catch (Exception e){
          return;
      }
    }
}
