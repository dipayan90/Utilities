package org.kajjoy.trees.operations;

import org.kajjoy.trees.Node;

public class InorderSuccessor {
	
	private Node root;
	
	public Node inorderSuccesor(Node currentNode){
		
		if(currentNode == null){
			return null;
		}
		
		if(currentNode.getLeftChild() != null){
			// if left child exists -> left child is next successor
			return currentNode.getLeftChild();
		}else if(currentNode.getRightChild() != null){
			// If left doesn't exist and only right exists,
			//then leftmost node on right subtree is the next inorder 
			//succesor
			return findMin(currentNode.getRightChild());
		}else{
			// case where there is no right subtree
			// start at root and traverse to the element
			
			//FUNDA: The deepest node for which the currentNode is on 
			//its left sub tree is its in order successor
			
			// More info: https://www.youtube.com/watch?v=5cPbNCrdotA
			Node successor = null;
			Node rootElem = root;
			while(rootElem.getData() != currentNode.getData()){
				if(currentNode.getData() < rootElem.getData()){
					successor = rootElem;
					rootElem = rootElem.getLeftChild();
				}else{
					rootElem = rootElem.getRightChild();
				}
			}
			return successor;
		}
	}
	
	private Node findMin(Node node){
		if(node == null){
			return null;
		}else if(node.getLeftChild() == null){
			return node;
		}
		return (node.getLeftChild());
	}

}
