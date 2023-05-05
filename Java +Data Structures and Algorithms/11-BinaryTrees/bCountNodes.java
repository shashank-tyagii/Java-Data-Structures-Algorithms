package bBinaryTrees;

public class bCountNodes {

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int count =1;
		count = count + countNodes(root.left);
		count = count + countNodes(root.right);
		return count;
	}
}
