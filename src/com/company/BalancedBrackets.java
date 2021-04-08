package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String args[]) throws IOException {
        try {

            Scanner sc = new Scanner(System.in);
            int testCases = Integer.parseInt(sc.nextLine());
            while (testCases-- > 0) {
                String brackets = sc.nextLine();
                Stack<Character> stack = new Stack<>();
                Boolean isBalanced = true;

                for (int i = 0; i < brackets.length(); i++) {

                    char ch = brackets.charAt(i);
                    if (ch == '(' || ch == '{' || ch == '[') {
                        stack.push(ch);

//                           System.out.println("pushing:"+stack.push(ch));

                    }

                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    } else if (ch == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();

//                               System.out.println("pop"+stack.pop());
                        } else {
                            isBalanced = false;
                            break;
                        }
                    } else if (ch == '}') {
                        if (stack.peek() == '{') {
                            stack.pop();
//                               System.out.println("pop"+stack.pop());
                        } else {
                            isBalanced = false;
                            break;
                        }
                    } else if (ch == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
//                               System.out.println("pop"+stack.pop());
                        } else {
                            isBalanced = false;
                            break;
                        }


                    }
                    if (stack.isEmpty()) {
                        isBalanced = true;

                    } else if (!stack.isEmpty()) {
                        isBalanced = false;
                    }


                }
                if (isBalanced) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}