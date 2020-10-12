package com.codersbay;

import java.util.List;

public class Queue {

    public static void enqueue(int newElement, List<Integer> queue) {
        queue.add(newElement);
    }

    public static int size(List<Integer> queue) {
        return queue.size();
    }

    public static int dequeue(List<Integer> queue) throws Exception {
        if (queue.size() == 0) {
            throw new Exception("Queue too small");
        }
        int removedElement = queue.get(0);
        queue.remove(queue.get(0));
        return removedElement;
    }

    public static int[] dequeue(int n, List<Integer> queue) throws Exception {
        if (queue.size() == 0) {
            throw new Exception("Queue too small");
        }
        int[] removedElements = new int[n];
        for (int i = 0; i < n; i++) {
            removedElements[i] = queue.get(0);
            queue.remove(queue.get(0));
        }
        return removedElements;
    }

    @Override
    public String toString() {
        return "Queue{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
