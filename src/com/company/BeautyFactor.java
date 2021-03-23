


/// to do later



package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautyFactor {


public static void solve(int b, int k){
      String max = "";
  while (b-->0){
      max= max +'9';
  }

    System.out.println(max);;
    int temp = Integer.parseInt(max);
for(int i =100;i<=temp;i++){
          int num =i;
          boolean visit [] = new boolean[k];
          while (num!=0){
              if(visit[num%10])
                  break;
              visit[num%10]=true;
              num=num/10;
          }


}

    }


    public static  void main(String args[]) throws IOException{


        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int b = Integer.parseInt(reader.readLine());
            int k = Integer.parseInt(reader.readLine());
solve(b,k);




        }catch (Exception e ){
            return;
        }
    }

}
