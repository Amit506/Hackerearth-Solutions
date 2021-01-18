package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.*;

public class LittleJhool {

    public static  void  main(String[] args)throws IOException {

         try{
             Scanner sc = new Scanner(System.in);
             String str =sc.nextLine();
             Pattern p = Pattern.compile(".*000000.*|.*111111.*");
             Matcher m = p.matcher(str);
             if(m.matches()){
                 System.out.println("Sorry, sorry!");

             }else {
                 System.out.println("Good luck!");
             }
         }catch (Exception e){
             return;
         }


    }
}
