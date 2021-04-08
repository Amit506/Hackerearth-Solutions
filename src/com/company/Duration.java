package com.company;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Duration {



    public static  void main(String args[])throws IOException{
        try{

            DateFormat sdf = new SimpleDateFormat("hh:mm");
            Scanner sc = new Scanner(System.in);
          int test = sc.nextInt();
          sc.nextLine();
          while (test-->0){
              String[] str = sc.nextLine().split(" ");
              Date start = sdf.parse(String.join(":",str[0],str[1]));
              Date end = sdf.parse(String.join(":",str[2],str[3]));
              long differenceInMilliSeconds
                      = Math.abs(end.getTime() - start.getTime());
//            System.out.println(differenceInMilliSeconds);
              System.out.println(   (differenceInMilliSeconds/(60*60*1000))%24   +" "+(differenceInMilliSeconds / (60 * 1000)) % 60 );
          }
        }catch ( Exception e){
            System.out.println(e);
            return;
        }
    }
}
