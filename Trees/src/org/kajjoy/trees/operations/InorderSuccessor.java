package org.kajjoy.trees.operations;

import org.kajjoy.trees.Node;

public class InorderSuccessor {
	
	private Node root;

	public void setRoot(Node rt){
		this.root = rt;
	}

	public Node getRoot(){
		return this.root;
	}
	
	public Node inorderSuccesor(Node currentNode){
		
		if(currentNode == null){
			return null;
		}

		if(currentNode.getRightChild() != null){
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
			// loop untill you get the element . Store the last element after which you went left . Thats the inorder succesor.
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
