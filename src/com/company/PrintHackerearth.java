package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;

public class PrintHackerearth {


    public  static  void main(String[] args) throws IOException {


      try{
          Scanner sc = new Scanner(System.in);

          int n = Integer.parseInt(sc.nextLine());

          String sr = sc.nextLine();
          int h=0;
          int a=0;
          int c=0;
          int k=0;
          int e =0;
          int r =0;
          int t =0;
          for(int i=0;i<sr.length();i++){
              char ch = sr.charAt(i);
              switch(ch){
                  case 'h':
                      h++;
                      break;
                  case  'a':
                      a++;
                      break;
                  case 'c':
                      c++;
                      break;
                  case  'k':
                      k++;
                  case 'e':

                      e++;
                      break;
                  case  'r':
                      r++;
                      break;
                  case 't':
                      t++;
                      break;

              }

          }

          h = h/2;
          a=a/2;
          e=e/2;
          r=r/2;
 List<Integer> tr = new ArrayList<>();
          tr.add(h);
          tr.add(a);
          tr.add(c);
          tr.add(k);
          tr.add(e);
          tr.add(r);
          tr.add(t);
//  Collections.sort(tr);
          System.out.println(tr);

      }catch (Exception e){
          return;
      }
    }

}
