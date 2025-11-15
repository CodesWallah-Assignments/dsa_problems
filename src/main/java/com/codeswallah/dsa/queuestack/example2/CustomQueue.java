package com.codeswallah.dsa.queuestack.example2;

import java.util.Stack;

public class CustomQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val) {
        stack1.push(val);
    }

    public int dequeue() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty!!");
        }

        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public int peek() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty!!");
        }

        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public int front() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty!!");
        }

        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public int rear() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty!!");
        }

        if (stack1.isEmpty()) {
            while(!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return stack1.peek();
    }
}
