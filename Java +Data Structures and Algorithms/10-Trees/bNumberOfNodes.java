package kTrees;

public class bNumberOfNodes {

	public static int numNodes(TreeNode<Integer> root) {
		if (root == null) {  // Not the base case, only edge case
			return 0;
		}
		int count = 1;   // Root itself
		for (int i = 0; i < root.children.size(); i++) {
			count = count + numNodes(root.children.get(i));
		}
		return count;
	}

}
