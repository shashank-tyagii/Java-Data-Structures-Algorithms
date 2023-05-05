package bBinaryTrees;

import java.util.ArrayList;

import cBST.BinaryTreeNode;

public class xCheckCousins {

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		
		ArrayList<Integer> findP = rootToNodePath(root, p);
		ArrayList<Integer> findQ = rootToNodePath(root, q);
		
		if (findP.size() == findQ.size() && findP.get(1) != findQ.get(1 )) {
			return true;
		}
		
		
		return false;
		
	}
	
	
public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int data){
		
		if (root == null) {
			return null;
		}
		
		if (root.data == data) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(root.data);
			return temp;
		}
		
		
		ArrayList<Integer> leftOutput = rootToNodePath(root.left, data);
		if (leftOutput != null) {      // Element is on the left side
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		
		ArrayList<Integer> rightOutput = rootToNodePath(root.right, data);
		if (rightOutput != null) {     // Element is on the right side
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
	}
	
	
	
}
//class BinaryTreeNode<T> {
//	T data;
//	BinaryTreeNode<T> left;
//	BinaryTreeNode<T> right;
//
//	public BinaryTreeNode(T data) {
//		this.data = data;
//	}
//}