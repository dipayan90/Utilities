package org.kajjoy.trees;

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
	}

	

}
