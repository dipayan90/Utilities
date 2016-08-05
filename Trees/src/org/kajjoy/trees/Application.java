package org.kajjoy.trees;

import org.kajjoy.trees.operations.InorderSuccessor;
import org.kajjoy.trees.operations.Tree;

public class Application {
	
	public static void main(String args[]){
		System.out.println("Welcome to the trees module");

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(11);
        tree.insert(7);
        tree.insert(17);
        tree.insert(19);
        tree.insert(3);
        tree.insert(8);
        tree.insert(5);

        System.out.println("Tree is: ");

        BTreePrinter.printNode(tree.getRoot());

        System.out.println("Height of the tree is: "+ tree.height(tree.getRoot()));

        System.out.println("In order traversal: ");
        tree.inorder(tree.getRoot());

        System.out.println("Min Element: "+ tree.findMinRecursive(tree.getRoot()));

        System.out.println("Max Element: "+ tree.findMax(tree.getRoot()));

        System.out.println("Lets find the in-order succesor: ");

        InorderSuccessor successor = new InorderSuccessor();
        successor.setRoot(tree.getRoot());
        Node succesor = successor.inorderSuccesor(tree.getRoot().getLeftChild().getLeftChild().getLeftChild().getRightChild());

        System.out.println("Inorder succesor of 5 is: "+ succesor.getData());
	}

}
