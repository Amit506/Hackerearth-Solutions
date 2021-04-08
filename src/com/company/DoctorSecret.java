package com.company;

import java.io.IOException;
import java.util.Scanner;

public class DoctorSecret {


    public static void main(String args[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int bookLength = sc.nextInt();
            int pagesNo = sc.nextInt();
//            System.out.println(bookLength);
//            System.out.println(pagesNo);
            if (bookLength <= 23 && pagesNo <= 1000 && pagesNo >= 500) {
                System.out.println("Take Medicine");
            } else {
                System.out.println("Don't take Medicine");
            }
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
