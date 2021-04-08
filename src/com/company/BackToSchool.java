package com.company;

import java.util.Scanner;

public class BackToSchool {


    public static void main(String srgs[]) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int temp = first;
        if (temp > second && temp > third) {
            System.out.println(first);
        } else if (temp < second || temp < third) {
            temp = second;
            if (temp > third) {
                System.out.println(second);
            } else System.out.println(third);
        }
    }
}
