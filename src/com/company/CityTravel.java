package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class CityTravel {


    public  static  void main(String[] args) throws IOException {

      try{
          Scanner sc = new Scanner(System.in);
          int s= sc.nextInt();
          int x = sc.nextInt();
          int n = sc.nextInt();
          int result=0;

          HashMap<Integer, Integer> map=new HashMap<>();
          while(n-->0){
              map.put(sc.nextInt(),sc.nextInt());


          }

          while (s>0){
              result++;
              if(map.containsKey(result)){
                  s = s-map.get(result);
              }else {
                  s =s-x;
              }
          }
          System.out.println(result);
      }catch (Exception e){
          return;
        }
    }
}
