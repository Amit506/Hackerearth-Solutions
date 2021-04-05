package com.company;

import java.io.IOException;
import java.util.Scanner;

public class VcPair {


    public static  void main(String args[])throws IOException{
       try {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-->0){
               int n = sc.nextInt();
               sc.nextLine();
               String str = sc.nextLine();
               int count =0;
               for(int i=0;i<n;i++){
                   if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u'){


                       if(str.charAt(i+1)=='a' || str.charAt(i+1)=='e' || str.charAt(i+1)=='i' || str.charAt(i+1)=='o' || str.charAt(i+1)=='u'){

                           count=count+1;

                           i=i+1;

                       }

                   }
               }
               System.out.println(count);
           }
       }catch (Exception e){
           System.out.println(e);
           return;
       }
    }
}
