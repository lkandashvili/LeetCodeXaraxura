package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
//        Stack<Character> stk = new Stack<>();
//        stk.push(';');
//        System.out.println(stk.peek());

        String s = "{[]}";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        boolean answer = false;
        boolean opened = false;
        int openedAndClosed = 0;

        loop :for (int i=0; i < s.length(); i++) {
            if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
                answer = false;
            }
            if (s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '{' || s.charAt(s.length()-1) == '[') {
                answer = false;
            }




            if ((s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')) {
                answer = false;
                opened = true;
                openedAndClosed++;
                stack.push(s.charAt(i));
                continue;
            }


            if (!stack.isEmpty()) {
                if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                    switch (s.charAt(i)) {
                        case ')' -> {
                            if (stack.peek() == '(') {
                                stack.pop();
                                answer = true;
                                openedAndClosed--;
                            } else {
                                answer = false;
                                break loop;
                            }
                        }
                        case '}' -> {
                            if (stack.peek() == '{') {
                                stack.pop();
                                answer = true;
                                openedAndClosed--;
                            } else {
                                answer = false;
                                break loop;
                            }
                        }
                        case ']' -> {
                            if (stack.peek() == '[') {
                                stack.pop();
                                answer = true;
                                openedAndClosed--;
                            } else {
                                answer = false;
                                break loop;
                            }
                        }
                        default -> {
                            answer = false;
                            return answer;
                        }
                    }
                } else {
                    return answer;
                }
            } else {
                answer = false;
            }
        }
        return answer;
    }
}
