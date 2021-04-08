package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Hamiltonian {
    public static void main(String args[]) throws IOException {
        try {

            Scanner sc = new Scanner(System.in);
            int students = sc.nextInt();
            int arrayMarks[] = new int[students];
            for (int i = 0; i < students; i++) {
                arrayMarks[i] = sc.nextInt();
            }

            for (int j = 0; j < students; j++) {

                boolean found = false;

                for (int k = j + 1; k < students; k++) {

                    if (arrayMarks[k] > arrayMarks[j]) {


                        found = true;

                        break;

                    } else {

                        continue;

                    }

                }

                if (found == false) {

                    System.out.print(arrayMarks[j] + " ");

                }


            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
