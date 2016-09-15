package org.kajjoy.linkedlists.queues;

import org.kajjoy.linkedlists.Runner;

import java.util.Scanner;

public class QueueRunner implements Runner {
    @Override
    public void run() {

        for(int i=0;i<5;i++){
            System.out.println("Please enter an element you wanna enter into a queue: ");
            Scanner scn = new Scanner(System.in);
            int val = scn.nextInt();
            Queue.enqueue(val);
        }

        System.out.println("Element on the top of the queue is: " + Queue.queueTop().getData());

        System.out.println("Lets delete the top element off the queue, the element we are deleting is: "+ Queue.dequeue().getData());

        System.out.println("The new element on top of the queue is: " + Queue.queueTop().getData());

        System.out.println("Lets delete the top element off the queue, the element we are deleting is: "+ Queue.dequeue().getData());

        System.out.println("The new element on top of the queue is: " + Queue.queueTop().getData());


    }
}
