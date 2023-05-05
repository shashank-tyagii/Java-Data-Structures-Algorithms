package cBST;
import java.util.ArrayList;
public class fRootToNodePath {

	// Binary tree
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
	
	
	
	// Binary Search Tree
	
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
		if (root == null) {
			return null;
		}
		
		if (root.data == data) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(root.data);
			return temp;
		}
		
		if (data > root.data) {
			ArrayList<Integer> rightside = getPath(root.right, data);
			if (rightside != null) {
				rightside.add(root.data);
				return rightside;
			}
			
		} else {
			ArrayList<Integer> leftSide = getPath(root.left, data);
			if (leftSide != null) {
				leftSide.add(root.data);
				return leftSide;
			}
			
		}
		
		return null;
	}
}
