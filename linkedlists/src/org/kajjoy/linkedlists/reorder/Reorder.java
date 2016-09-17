package org.kajjoy.linkedlists.reorder;

import org.kajjoy.linkedlists.Printer;
import org.kajjoy.linkedlists.core.Node;

public class Reorder {

    private static final Printer printer = new Printer();

    private static Node top;

    public static Node execute(Node start){

        Node slow = start;
        Node fast = start;
        while(fast != null){
            slow= slow.getNext();
            fast = fast.getNext().getNext();
        }
        Node mid = slow;
        System.out.println("Midpoint of the linked list is: ");
        printer.print(mid);
        System.out.println("Reverse linked list from mid is: ");
        Node reverseList = reverseLL(mid);
        printer.print(reverseList);
        Node partBeforeMid  = split(start,mid);
        Node res = merge(partBeforeMid,reverseList);
        return res;
    }

    private static Node reverse(Node start){
        Node newNode = new Node(start.getData());
        if(top == null){
            top = newNode;
        }else{
            newNode.setNext(top);
            top = newNode;
        }
        return top;
    }

    private static Node reverseLL(Node start){
        Node current = start;
        Node result = null;
        while(current != null){
            result = reverse((current));
            current = current.getNext();
        }
        return result;
    }

    private static Node merge(Node ll1,Node ll2){
        Node start = null;
        Node current = null;
        while(ll1 != null || ll2 != null){
            if(ll1 != null){
                Node newNode = new Node(ll1.getData());
                if(start == null){
                    start = newNode;
                    current  = start;
                }else{
                    current.setNext(newNode);
                    current = newNode;
                }
                ll1 = ll1.getNext();
            }

            if(ll2 != null){
                Node newNode1 = new Node(ll2.getData());
                if(start == null){
                    start = newNode1;
                    current  = start;
                }else{
                    current.setNext(newNode1);
                    current = newNode1;
                }
                ll2 = ll2.getNext();
            }
        }
        return start;
    }

    private static Node split(Node begin,Node target){
        Node current = begin;
        Node start = null;
        Node curr = null;
        while(!current.equals(target)){
            Node newNode = new Node(current.getData());
            if(start == null){
                start = newNode;
                curr = start;
            }else{
                curr.setNext(newNode);
                curr = newNode;
            }
            current = current.getNext();
        }
        return start;
    }

}
