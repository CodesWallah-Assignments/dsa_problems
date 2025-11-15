package com.codeswallah.dsa.queuestack.example1;

public class Main {
    public static void main(String[] args) {
//        CustomStack stack = new CustomStack();

        MyStack<Integer> stack = new MyStack<>();

        System.out.println("Stack isEmpty : " + stack.isEmpty());
        System.out.println("Stack size : " + stack.size());
        stack.push(10);
        stack.push(12);
        stack.push(9);

        System.out.println("Stack peek : " + stack.peek());
        System.out.println("Top of stack : " + stack.top());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Stack size : " + stack.size());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());

    }
}
