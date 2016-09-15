package org.kajjoy.linkedlists.core;

public class Node {

    private Node next;
    private int data;

    public Node(int val){
        this.data = val;
    }

    public Node(){

    }

    public Node getNext(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}
