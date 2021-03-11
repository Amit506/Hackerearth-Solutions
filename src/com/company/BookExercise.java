package com.company;

import java.io.IOException;
import java.util.*;

public class BookExercise {



    static  int minValue(Stack<Integer> stacks){
       Object[] array = stacks.toArray();
       Arrays.sort(array);

       return (int)array[0];


    }


    public static void main(String args[])throws IOException{
try
{


    Scanner sc = new Scanner(System.in);
    int actions = Integer.parseInt(sc.nextLine());
    Stack<String> exercise = new Stack<>();
    Stack<Integer> list = new Stack<>();

    while(actions-->0){

        String str1 = sc.nextLine();



        if (Integer.parseInt(str1.split(" ")[0]) == -1) {

          int minimum=  minValue(list);






            int i = 0;
            while (!exercise.isEmpty()) {

                if (Integer.parseInt(exercise.peek().split(" ")[0]) == minimum) {
                    System.out.println(i+" "+exercise.peek().split(" ")[1]);
                    exercise.pop();
                   int rem= list.indexOf(minimum);


                    list.remove(rem);

                    break;

                }

                else {


                    exercise.pop();
                    list.pop();


                    i++;

                }



            }
        } else {
            exercise.add(str1);
            String[] str = exercise.peek().split(" ");
            list.add(Integer.parseInt(str[0]));





        }




    }
    System.out.println(exercise);
    System.out.println(list);

}catch (Exception e){
    System.out.println(e.toString());
}

    }
}
