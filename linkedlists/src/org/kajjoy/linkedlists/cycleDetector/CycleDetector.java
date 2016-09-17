package org.kajjoy.linkedlists.cycleDetector;

import org.kajjoy.linkedlists.core.Node;

public class CycleDetector {

    public static boolean detect(Node start){
        Node slow = start;
        Node fast = start;
        while(fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

}
