package bBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class vLevelOrderTraversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes1 = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes2 = new QueueUsingLL<>();
		pendingNodes1.enqueue(root);
        
		System.out.println(root.data + " ");
		while (!pendingNodes1.isEmpty()) {
			
			while (!pendingNodes1.isEmpty()) {
				BinaryTreeNode<Integer> front;
                
                try{
                    front = pendingNodes1.dequeue();
                } catch (Exception e){
                    front = null;
                }
               // System.out.print(front.data + " ");
					if (front.left != null) {
						System.out.print(front.left.data+ " ");
	                    pendingNodes2.enqueue(front.left);
					}
					if (front.right != null) {
						System.out.print(front.right.data + " ");
	                    pendingNodes2.enqueue(front.right);
					}
                
			}
			System.out.println();     
            pendingNodes1 = pendingNodes2;
            pendingNodes2 = new QueueUsingLL<>() ;
			
		}
	}
	
	// Code copied from Coding Ninjas
	public static void printLevelWiseBetter(BinaryTreeNode<Integer> root) { 
		
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root); 
		pendingNodes.add(null); 
		
		// In this case, we add a differentiator as null into queue as null.
		// If node == null, go to next line because next element is at next level and add another null to the queue
		// 1 - null - 2 -3 - null - 4-5-6-7- 
		while(!pendingNodes.isEmpty()) { 
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll(); 
			if (frontNode == null) { 
				System.out.println();     // Next level
				if (!pendingNodes.isEmpty()) { 
					pendingNodes.add(null); 
					} 
			} else { 
					System.out.print(frontNode.data + " "); 
					if (frontNode.left != null) { 
						pendingNodes.add(frontNode.left); 
						} 
					if (frontNode.right != null) { 
						pendingNodes.add(frontNode.right); 
						} 
					} 
			} 
		}
	
}
