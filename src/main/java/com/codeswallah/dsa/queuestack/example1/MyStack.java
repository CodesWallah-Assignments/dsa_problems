package com.codeswallah.dsa.queuestack.example1;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<T> {
    Deque<T> queue1 = new ArrayDeque<>();
    Deque<T> queue2 = new ArrayDeque<>();

    public void push(T val) {
        queue1.offer(val); // O(1)
    }

    // O(n)
    public T pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty !!");
        }

        while(queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        T popped = queue1.poll();

        Deque<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return popped;
    }

    //O(n)
    public T top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty !!");
        }

        return peek();
    }

    //O(n)
    public T peek() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty !!");
        }

        while(queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        T peeked = queue1.peek();
        queue2.offer(queue1.poll());

        Deque<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return peeked;
    }

    //O(1)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int size() {
        return queue1.size();
    }
}
