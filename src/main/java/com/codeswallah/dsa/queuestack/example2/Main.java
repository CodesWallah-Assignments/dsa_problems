package com.codeswallah.dsa.queuestack.example2;

public class Main {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        System.out.println("Is queue empty : " + queue.isEmpty());
        System.out.println("Size of queue : " + queue.size());
        queue.enqueue(12);
        queue.enqueue(8);
        queue.enqueue(10);

        System.out.println("Front : " + queue.front());
        System.out.println("Rear : " + queue.rear());
        System.out.println("Dequeue val : " + queue.dequeue());
        System.out.println("Dequeue val : " + queue.dequeue());
        System.out.println("Size of queue : " + queue.size());

        queue.enqueue(15);
        queue.enqueue(7);
        System.out.println("Size of queue : " + queue.size());

        System.out.println("Front : " + queue.front());
        System.out.println("Rear : " + queue.rear());


    }
}
