package com.company;

import java.io.IOException;

import java.util.Scanner;

public class NumberOfSteps {

//    public static int getMinValue(int[] numbers){
//        int minValue = numbers[0];
//        for(int i=1;i<numbers.length;i++){
//            if(numbers[i] < minValue){
//                minValue = numbers[i];
//            }
//        }
//        return minValue;
//    }


    public static void main (String[] args) throws IOException

    {
       try {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int [] a = new int[n];
           int [] b = new int[n];
           boolean bool = true;
           boolean exit = true;
           int minimum =500000;
           long count=0;
           for(int i =0;i<n;i++){
               a[i]= sc.nextInt();
               if(a[i]<minimum){
                   minimum=a[i];
               }
           }
           for(int i =0;i<n;i++){
               b[i]= sc.nextInt();


           }


          int i =0;
           while (i!=n&&exit) {

               while (a[i] > minimum) {
                   a[i] = a[i] - b[i];

                   if (a[i] < minimum) {
                       bool = false;
                       exit=false;
                       break;
                   }
                   count++;
               }
               i++;

           }
           if(bool){
               System.out.println(count);
           }else {
               System.out.println("-1");
           }

       }catch (Exception e){
           System.out.println(e);
           return;
       }

    }

}
