package com.codeswallah.dsa.queuestack.example3;

import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '('
                    || c == '{'
                    || c == '[') {
                stack.push(c);
                continue;
            }
            /**
             * what if your input string is )(
             */
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.pop();
            if (c == ')' && top != '('
                    || c == '}' && top != '{'
                    || c == ']' && top != '[')
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String test = "(({}))";
        System.out.println(test + " isValid : " + isValid(test));
        test = ")(";
        System.out.println(test + " isValid : " + isValid(test));
        test = "()";
        System.out.println(test + " isValid : " + isValid(test));
    }
}
