package com.codeswallah.dsa.queuestack.example1;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomStack {
    Deque<Integer> queue1 = new ArrayDeque<>();
    Deque<Integer> queue2 = new ArrayDeque<>();

    public void push(int val) {
        queue1.offer(val); // O(1)
    }

    // O(n)
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty !!");
        }

        while(queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        int popped = queue1.poll();

        Deque<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return popped;
    }

    //O(n)
    public int top() {
        if (queue1.isEmpty()) {
            return -1;
        }

        return peek();
    }

    //O(n)
    public int peek() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty !!");
        }

        while(queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        int peeked = queue1.peek();
        queue2.offer(queue1.poll());

        Deque<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return peeked;
    }

    //O(1)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // O(1)
    public int size() {
        return queue1.size();
    }
}
