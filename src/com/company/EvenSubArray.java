package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class EvenSubArray {


    public static void main(String args[]) throws IOException {
        try {


            Scanner sc = new Scanner(System.in);
            int testcases = Integer.parseInt(sc.nextLine());
            while (testcases-- > 0) {
                String binaryString = sc.nextLine();


                Stack<Character> stack = new Stack<>();
                for (int i = binaryString.length() - 1; i >= 0; i--) {
                    if (stack.isEmpty()) {
                        stack.push(binaryString.charAt(i));
                    } else {
                        if (stack.peek().equals(binaryString.charAt(i))) {
                            stack.pop();
                        } else {
                            stack.push(binaryString.charAt(i));
                        }
                    }

                }
                if (stack.size() < 1) {
                    System.out.println("KHALI");
                } else {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop() + " ");

                    }
                }


            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}