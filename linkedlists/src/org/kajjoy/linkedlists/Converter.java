package org.kajjoy.linkedlists;

import org.kajjoy.linkedlists.core.Node;

public class Converter {

    public Node stringToLinkedList(String str){
        String[] segs = str.split(",");
        Node first = null;
        Node current = null;
        for(String seg: segs){
            Node newNode = new Node(Integer.parseInt(seg));
            if(first == null){
                first = newNode;
                current = first;
            }else{
                current.setNext(newNode);
                current = newNode;
            }
        }
        return first;
    }

}
