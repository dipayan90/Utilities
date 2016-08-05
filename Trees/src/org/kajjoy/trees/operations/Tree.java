package org.kajjoy.trees.operations;

import org.kajjoy.trees.Node;

public class Tree {
	
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public Node find(int data){
		Node currentNode = this.root;
		while(currentNode.getData()!= data){
			if(data>currentNode.getData()){
				currentNode = currentNode.getRightChild();
			}else if(data<currentNode.getData()){
				currentNode = currentNode.getLeftChild();
			}
			if(currentNode == null){
				return null;
			}
		}
		return currentNode;
	}
	
	public void insert(int data){
		
		Node newNode = new Node();
		newNode.setData(data);
		
		if(root == null){
			root = newNode;
		}else{
			Node current = root;
			Node parent;
			while(true){
				 parent = current;
				if(data > current.getData()){
					current = current.getRightChild();
					if(current == null){
						parent.setRightChild(newNode);
						return;
					}
				}else if(data<current.getData()){
					current = current.getLeftChild();
					if(current == null){
						parent.setLeftChild(newNode);
						return;
					}
				}	
			}
		}
	}
	
	public int height(Node current){
		if(current == null){
			return -1;
		}
			int leftHeight = height(current.getLeftChild());
			 int rightHeight = height(current.getRightChild());
		
		// At each step of the recursion we are adding 1 below so thats 
			 //how the height gets incremented. 
		if(leftHeight > rightHeight){
			return leftHeight + 1;
		}else{
			return rightHeight + 1;
		}
		
	}
	
	public int heightAlternate(Node current){
		// see https://www.youtube.com/watch?v=_pnqMz5nrRs
		if(current == null){
			return -1;
		}
		return 1+ Math.max(heightAlternate(current.getLeftChild()),heightAlternate(current.getRightChild()));
	}
	
	// Iterative Solution
	public int findMinIterative(){
		Node current = root;
		if(current == null){
			//error condition
			return -1;
		}
		while(current.getLeftChild() != null){
			current = current.getLeftChild();
		}
		return current.getData();
	}
	
	// Recursive solution
	public int findMinRecursive(Node current){
		if(current == null){
			return -1;
		}else if(current.getLeftChild() == null){
			return current.getData();
		}
		return findMinRecursive(current.getLeftChild());
	}
	
	public void inorder(Node current){
		if(current == null){
			return ;
		}
		inorder(current.getLeftChild());
		System.out.println(current.getData());
		inorder(current.getRightChild());
	}
	

}
