package com.company;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TheGame {




    public  static  void main(String args[])throws IOException{
        try{


//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//            long testCases= Integer.parseInt(reader.readLine());
            Scanner sc = new Scanner(System.in);
            int testCases = sc.nextInt();
            while (testCases-->0){
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();

                int rio=0;
                int tokyo =0;
                int[] array = new int[n];
                for(int i=0;i<n;i++){

                  array[i]= sc.nextInt();
                }


    for(int i =0;i<n;i++){
    if(array[i]%a==0){
        rio++;
    }if(array[i]%b==0){
        tokyo++;
    }
}


if(rio>tokyo){
    System.out.println("Rio");
}

else{
    System.out.println("Tokyo");
}

            }

        }catch (Exception e){
            System.out.println(e);
            return;
        }
    }
}
