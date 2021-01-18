package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Dice {
    
    public  static void main(String[] args)throws IOException {

      try{
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          int result =0;

          for(int i=0;i<str.length();i++){
              char ch = str.charAt(i);
              if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'){
                  if(ch!='6'){
                      result++;

                  }
                  else {
                      continue;
                  }
              }
              else {
                  result=1;
              }

          }
          System.out.println(result);
      }catch (Exception e){
          return;
      }
    }
}


