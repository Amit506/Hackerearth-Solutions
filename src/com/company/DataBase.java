package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {


    public  static  void main(String args[])throws IOException{

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int temp =n;
          sc.nextLine();
            List<String> attr = new ArrayList<>();
            List<String> content = new ArrayList<>();

            for(int i =0;i<m;i++){
                attr.add(sc.next());
            }
          sc.nextLine();
            while (n-->0){
                for(int i =0;i<m;i++){
                    content.add(sc.next());
                }
            }
//            System.out.println(attr);
//            System.out.println(content);
            System.out.println();
            System.out.println("+-------------+------------+--------+------------+--------+");
            for(int i =0;i<m;i++){

                System.out.print("|    "+attr.get(i)+"  |");

            }
            System.out.println();
            System.out.println("+-------------+------------+--------+------------+--------+");


          for (int i =0;i<m;i++){
              System.out.print("| "+ content.get(i)+ "  |");
          }
            System.out.println();
            for (int i =5;i<10;i++){
                System.out.print("| "+ content.get(i)+ "  |");
            }

            System.out.println();
            System.out.println("+-------------+------------+--------+------------+--------+");

        }
    }
}
