package org.kajjoy.linkedlists.deleteDuplicates;


import org.kajjoy.linkedlists.core.Node;

public class DeleteDuplicates {

    public static Node detectAndRemove(Node begin){
        Node start = begin;
        while(begin.getNext() != null){
            while(begin.getData() == begin.getNext().getData()){
                if(begin.getNext().getNext() != null){
                    begin.setNext(begin.getNext().getNext());
                }else{
                    begin.setNext(null);
                }
            }
            begin = begin.getNext();
        }
        return start;
    }
}
