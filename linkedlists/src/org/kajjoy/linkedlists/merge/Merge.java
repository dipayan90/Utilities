package org.kajjoy.linkedlists.merge;

import org.kajjoy.linkedlists.core.Node;

public class Merge {

    public static Node execute(Node node1,Node node2){
        Node start = null;
        Node current = null;
        while(node1 != null || node2 != null){

            if(node1 != null && node2 != null){
               if(node1.getData() < node2.getData()){
                   Node newNode1 = new Node(node1.getData());
                   if(start == null){
                       start = newNode1;
                       current = start;
                   }else{
                       current.setNext(newNode1);
                       current = newNode1;
                   }
                   node1 = node1.getNext();
               }else{
                   Node newNode2 = new Node(node2.getData());
                   if(start == null){
                       start = newNode2;
                       current = start;
                   }else{
                       current.setNext(newNode2);
                       current = newNode2;
                   }
                   node2 = node2.getNext();
               }
            }else if(node1 != null && node2 == null){
                while(node1 != null){
                    Node newNode = new Node(node1.getData());
                    if(start == null){
                        start = newNode;
                        current = start;
                    }else{
                        current.setNext(newNode);
                        current = newNode;
                    }
                    node1 = node1.getNext();
                }
            }else{
                while(node2 != null){
                    Node newNode = new Node(node2.getData());
                    if(start == null){
                        start = newNode;
                        current = start;
                    }else{
                        current.setNext(newNode);
                        current = newNode;
                    }
                    node2 = node2.getNext();
                }
            }
        }
        return start;
    }
}
