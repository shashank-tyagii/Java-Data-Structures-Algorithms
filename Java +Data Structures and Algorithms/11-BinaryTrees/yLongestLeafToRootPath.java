package bBinaryTrees;

import java.util.ArrayList;

import cBST.BinaryTreeNode;

public class yLongestLeafToRootPath {

	
	static int max = 0;
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root, int depth){
		if (root == null) {
			if (depth > max) {
				max= depth;
				ArrayList<Integer> temp = new ArrayList<>();
				return temp;
			}
			return null;
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<Integer> leftOutput = longestRootToLeafPath(root.left, depth+1);
		ArrayList<Integer> rightOutput = longestRootToLeafPath(root.right, depth+1);
		
		if (leftOutput != null && rightOutput !=null) {      // Element is on the left side
			if (leftOutput.size()> rightOutput.size()){
			ans = leftOutput;
			} else {
			ans = rightOutput;
			}
		} else if (leftOutput != null){
			ans = leftOutput;
		} else if (rightOutput !=null){
			ans = rightOutput;
		}

		ans.add(root.data);

		return ans;

	}
	
}
