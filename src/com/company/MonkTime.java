package com.company;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkTime {



    public static  void main(String args[])throws IOException{

    try{
        Scanner sc= new Scanner(System.in);
        int tasks= sc.nextInt();
        int temp = tasks;
        int time = 0;
        Deque<Integer> callingOrder = new LinkedList<Integer>();
        Deque<Integer> idealOrder = new LinkedList<Integer>();


        while (tasks-->0){
            callingOrder.add(sc.nextInt());
        }
        sc.nextLine();
        tasks=temp;
        while (tasks-->0){
            idealOrder.add(Integer.parseInt(sc.next()));
        }

        while (!callingOrder.isEmpty()){


            if(callingOrder.peek()!= idealOrder.peek()){
                callingOrder.addLast(callingOrder.pop());
                time++;

            }else {
                callingOrder.pop();
                idealOrder.pop();
                time++;
            }

        }
        System.out.println(time);

    }catch (Exception e){
        System.out.println(e.toString());
    }

    }
}
