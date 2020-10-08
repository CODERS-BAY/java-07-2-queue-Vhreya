package com.codersbay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    List<Integer> queue = new ArrayList<>();

    @Test
    public void testIfNewElementGetsAddToQueue() {
        int newElement = 5;
        Queue.enqueue(newElement, queue);
        assertEquals(5, queue.get(0));
        assertEquals(1, queue.size());
    }

    @Test
    public void testIfSizeMethodReturnsCorrectValue() {
        queue.add(2);
        queue.add(5);
        assertEquals(2, queue.size());
        queue.add(6);
        queue.add(1);
        queue.add(0);
        assertEquals(5, queue.size());
    }

    @Test
    public void testIfDequeueMethodReturnsCorrectValue() throws Exception {
        assertThrows(Exception.class, ()-> {
            Queue.dequeue(queue);
        });
        queue.add(6);
        queue.add(1);
        queue.add(0);
        queue.add(2);
        queue.add(5);
        assertEquals(6, Queue.dequeue(queue));
        assertEquals(1, Queue.dequeue(queue));
        assertEquals(0, Queue.dequeue(queue));
    }

    @Test
    public void testIfDequeueCanDeleteSeveralElementsAtOnce() throws Exception {
        assertThrows(Exception.class, ()-> {
            Queue.dequeue(queue);
        });
        int n = 2;
        queue.add(6);
        queue.add(1);
        queue.add(0);
        queue.add(2);
        queue.add(5);
        assertArrayEquals(new int[]{6, 1}, Queue.dequeue(n, queue));
    }

    @Test
    public void testIfEqualsMethodGotOverrideCorrect() {
         int[] test1 = {1,6};
         int[] test2 = {1, 6};
         assertArrayEquals(test1, test2);
    }

}
