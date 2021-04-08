package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cipher {


    public  static  void main(String args [])throws IOException{
        try {
            Scanner s = new Scanner(System.in);
            String n = s.nextLine();
            int key = s.nextInt();
StringBuilder str = new StringBuilder(n);
            StringBuilder temp = new StringBuilder();
            for(int i= 0; i<n.length(); i++){
                int ch =(int) str.charAt(i);
//                System.out.println("------"+ch);
                if(ch>=65&&ch<=90){

                     ch = ('A' + ( (ch + (key%26) ) - 'A')%26);
                     temp.append(((char) ch));
//                    System.out.println(ch);
                }
                else if(ch>=97&&ch<=122){
                    ch ='a' + ( (ch + (key%26) ) - 'a')%26;
//                    System.out.println(ch);
                    temp.append(((char) ch));
                } else  if( (ch>= 48 && ch<=57 ) )

                {

            ch='0' + ( (ch + (key%10) ) - '0')%10;
//                    System.out.println(ch);
                    temp.append(((char) ch));

                }
                else {
                    temp.append(((char) ch));
                }

            }
            System.out.println(temp.toString());

        }catch (Exception e){
            System.out.println(e);
            return;
        }
    }
}
