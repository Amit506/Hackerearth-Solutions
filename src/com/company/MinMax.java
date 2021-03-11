package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {


    boolean  checkAnswer(ArrayList array) {

        boolean ans = false ;
        Collections.sort(array);
//        System.out.println(array);
        int min = ((int) array.get(0));
//        System.out.println(min);
        int max = ((int) array.get(array.size() - 1));
//        System.out.println(max);
        for(int i =min;i<max;i++){
            if (array.contains(i)){
                ans=true;

            }
            else {
                ans=false;
                break;
            }
        }

       return ans;

    }


    public  static  void main( String args[])throws  IOException{

       try{
           Scanner sc  = new Scanner(System.in);
           MinMax minMax = new MinMax();
           int arraySize = sc.nextInt();
           ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0;i<arraySize;i++){

            arrayList.add(sc.nextInt());
        }


       boolean answer =  minMax.checkAnswer(arrayList);
           if(answer){
               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }
        }catch (Exception e){
           return;
       }
//        boolean answer = minMax.checkAnswer(array);
//        System.out.println(answer);

    }
}
