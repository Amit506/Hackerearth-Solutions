package com.company;

import java.io.IOException;
import java.util.Scanner;

public class RoboticMoves {

    public static void main(String args[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int testCases = sc.nextInt();
            RoboticMoves roboticMoves = new RoboticMoves();
            while (testCases-- > 0) {

                long moves = sc.nextInt();
                System.out.println(moves * (moves + 1));


            }
        } catch (Exception e) {
            return;
        }


    }
}
