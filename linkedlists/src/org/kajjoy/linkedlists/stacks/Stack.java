package org.kajjoy.linkedlists.stacks;

import org.kajjoy.linkedlists.core.Node;

public class Stack {

    private static Node top;

    public static void push(int val){
        Node newNode = new Node(val);
        if(top == null){
            top = newNode;
        }else{
            newNode.setNext(top);
            top = newNode;
        }
    }

    public static Node peek(){
        return top;

    }

    public static Node pop(){
        if(top == null){
            return null;
        }
        Node temp = new Node(top.getData());
        top = top.getNext();
        return temp;
    }

}
