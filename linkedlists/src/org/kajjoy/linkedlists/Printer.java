package org.kajjoy.linkedlists;

import org.kajjoy.linkedlists.core.Node;

public class Printer {

    public void print(Node start){
        Node current = start;
        while(current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.print(" null ");
    }
}
