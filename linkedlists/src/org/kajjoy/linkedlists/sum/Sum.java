package org.kajjoy.linkedlists.sum;

import org.kajjoy.linkedlists.core.Node;

public class Sum {

    public static Node compute(Node num1,Node num2){
        Node current1 = num1;
        Node current2 = num2;
        Node first = null;
        Node current = null;
        int carry = 0;

        while(current1 != null && current2 != null){
            carry += current1.getData();
            carry += current2.getData();
            Node newNode = new Node(carry % 10);
            if(first == null){
                first = newNode;
                current = first;
            }else{
                current.setNext(newNode);
                current = newNode;
            }
            if(carry > 10){
                carry = 1;
            }else{
                carry = 0;
            }
            current1 = current1.getNext();
            current2 = current2.getNext();
        }
        return first;
    }
}
