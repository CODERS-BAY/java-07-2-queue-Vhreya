package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Integer> queue = new ArrayList<>();
        int newElement;

        System.out.println("What do you want to do? '+' for add elements, '?' for size of stack, '-' for removing an element form the queue and 'more' for deleting more elements at once");

        String answer = sc.nextLine();
        if (answer.equals("+")) {
            System.out.println("Type in the elements you want to add. Stop with 'q'.");
            while (!sc.hasNext("q")) {
                newElement = sc.nextInt();
                Queue.enqueue(newElement, queue);
            }
            System.out.println(queue);
        }

        if (answer.equals("?")) {
            System.out.println(Queue.size(queue));
        }

        if (answer.equals("-")) {
            Queue.dequeue(queue);
            System.out.println(queue);
        }

        if (answer.equals("more")) {
            System.out.println("How many elements do you want to remove?");
            int n = sc.nextInt();
            System.out.println(Arrays.toString(Queue.dequeue(n, queue)));
        }
    }

}
