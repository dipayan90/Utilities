package org.kajjoy.linkedlists.queues;

import org.kajjoy.linkedlists.core.Node;

public class Queue {

    static Node first;
    static Node current;

    public static void enqueue(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            current = first;
        }else{
            current.setNext(newNode);
            current = newNode;
        }
    }

    public static Node queueTop(){
        return first;
    }

    public static Node dequeue(){
        Node temp = new Node(first.getData());
        first = first.getNext();
        return temp;
    }
}
