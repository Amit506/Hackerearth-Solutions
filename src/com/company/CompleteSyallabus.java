package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompleteSyallabus {



    public static void main( String args[])
    throws IOException {

try {

    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();
    while (testCases-->0){
        int dayId =0;
        int initialCovered=0;
        int totalTopics = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(7);
        for(int i=0;i<7;i++){
            arrayList.add(sc.nextInt());
        }
        while (initialCovered<totalTopics){
            for(int i =0;i<7;i++){
                if(initialCovered<totalTopics){
                    initialCovered=initialCovered+ arrayList.get(i);
                    dayId=i;
                }
                else{
                    break;
                }
            }


        }
        switch (dayId){

            case 0 : {
                System.out.println("MONDAY");
            }
            break;
            case 1 : {
                System.out.println("TUESDAY");
            }
            break;
            case 2 : {
                System.out.println("WEDNESDAY");
            }
            break;
            case 3 : {
                System.out.println("THURSDAY");
            }
            break;case 4 : {
                System.out.println("FRIDAY");
            }
            break;
            case 5 : {
                System.out.println("SATURDAY");
            }
            break;
            case 6 : {
                System.out.println("SUNDAY");
            }
            break;

        }


    }
}catch (Exception e){
    return;
}
    }
}
