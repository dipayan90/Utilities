package org.kajjoy.linkedlists.cycleDetector;

import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.Runner;
import org.kajjoy.linkedlists.core.Node;

public class CycleDetectorRunner implements Runner {

    private final Printer printer = new Printer();

    @Override
    public void run() {

        Node first = null;
        Node current = null;

        // creating linked list
        for(int i: new Integer[]{1,2,3,4,5,6}){
            Node newNode = new Node(i);
            if(first == null){
                first = newNode;
                current  = first;
            }else{
                current.setNext(newNode);
                current = newNode;
            }
        }
        //creating cycle
        current.setNext(first);
        System.out.println("Linked list entered is: ");
        System.out.println("The result for cyclic linkedlist is: ");
        boolean res = CycleDetector.detect(first);
        System.out.print(res);
    }
}
