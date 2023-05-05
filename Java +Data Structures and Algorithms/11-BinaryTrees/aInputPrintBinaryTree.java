package bBinaryTrees;
import java.util.ArrayList;
import java.util.Scanner;

import cBST.BinaryTreeNode;

public class aInputPrintBinaryTree {
	
	public static BinaryTreeNode<Integer> takeinput(Scanner scn){
		
			System.out.println("Enter the root data");
			int data = scn.nextInt();
			if(data == -1) {              // Leaf node
				return null;
			}
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
			root.left = takeinput(scn);
			root.right = takeinput(scn);
			return root;

	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted= root.data + " : ";
		if (root.left != null) {
			toBePrinted += "L" + root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += "R" + root.right.data ;
		}
		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {   // Using queue
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			front = pendingNodes.dequeue();
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}
public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		if (root == null) {
			return;
		}
		
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes1 = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes2 = new QueueUsingLL<>();
		pendingNodes1.enqueue(root);
        
		
		while (!pendingNodes1.isEmpty()) {
			
			while (!pendingNodes1.isEmpty()) {
				BinaryTreeNode<Integer> front;
                
                try{
                    front = pendingNodes1.dequeue();
                } catch (Exception e){
                    front = null;
                }
                System.out.print(front.data + ":");
					if (front.left != null) {
						System.out.print("L:" +front.left.data+",");
	                    pendingNodes2.enqueue(front.left);
					}else {
	                    System.out.print("L:" + "-1"+ ",");
	                }
					if (front.right != null) {
						System.out.print("R:"+ front.right.data);
	                    pendingNodes2.enqueue(front.right);
					}else {
	                    System.out.print("R:" + "-1");
	                }
                System.out.println();
			}
			            
            pendingNodes1 = pendingNodes2;
            pendingNodes2 = new QueueUsingLL<>() ;
			
		}
		
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(1);
//		root.left = node1;
//		root.right = node2;
		
		Scanner scn = new Scanner(System.in);
		
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		 print(root);
		
		
	}
	

	

}
