package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class CapillaryGame {


    public static  void main(String args[])throws IOException{

        try{

            Scanner sc = new Scanner(System.in);
            int listSize = Integer.parseInt(sc.nextLine());
            List<Integer>   list = new ArrayList<>(listSize);
            List<Integer> result = new ArrayList<>();
            while (listSize-->0){
                list.add(sc.nextInt());
            }
            Stack<Integer> B = new Stack<>();
            B.addAll(list);

            Stack<Integer> A = new Stack<>();
            Collections.reverse(list);
            A.addAll(list);


            while (!A.isEmpty()&&!B.isEmpty()) {
                if(A.peek()>B.peek()){
                    result.add(1);
                    B.pop();
                }else if(A.peek()<B.peek()){
                    A.pop();
                    result.add(2);
                }else {
                    result.add(0);
                    A.pop();B.pop();
                }





            }

           result.forEach((temp)->{
               System.out.print(temp+" ");
           });
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
