package org.kajjoy.trees.bfs;

import org.kajjoy.trees.BTreePrinter;
import org.kajjoy.trees.Node;
import org.kajjoy.trees.Runner;
import org.kajjoy.trees.operations.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BFSRunner implements Runner{

    @Override
    public void run() {
        System.out.println("Please enter the values that you want to insert into the tree");
        Scanner scn = new Scanner(System.in);
        List<Integer> nodeValues = new ArrayList<>();
        while(scn.hasNextBigInteger()){
            nodeValues.add(scn.nextInt());
        }
        Tree tree = new Tree();
        nodeValues.forEach(e -> tree.insert(e));
        System.out.println("The tree we are going to work with is: ");
        BTreePrinter.printNode(tree.getRoot());

        System.out.println("Please enter the target");
        Scanner targetIn = new Scanner(System.in);
        int target = targetIn.nextInt();
        Node result =  BFS.find(tree.getRoot(),target);
        System.out.println("Node found and is: "+ result.getData());
    }
}
