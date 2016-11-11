package org.kajjoy.trees.bfs;

import org.kajjoy.trees.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static Node find(Node root, int target){
        Queue<Node> toVisit = new LinkedList<>();
        Set<Node> alreadyVisited = new HashSet<>();
        if(root == null){
            return null;
        }else{
            toVisit.add(root);
            while(true){
                Node current = toVisit.poll();
                System.out.println("Node visited is: "+ current.getData());
                alreadyVisited.add(current);
                if(current.getData() == target){
                    return current;
                }else{
                    if(current.getLeftChild() != null && !alreadyVisited.contains(current.getLeftChild())){
                        toVisit.add(current.getLeftChild());
                    }
                    if(current.getRightChild() != null && !alreadyVisited.contains(current.getRightChild())){
                        toVisit.add(current.getRightChild());
                    }
                }
            }
        }

    }
}
