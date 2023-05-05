package bBinaryTrees;

public class gHeightOfTree {
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int height1 = height(root.left);
		int height2 = height(root.right);
		
		return 1 + Math.max(height1, height2);
	}
}
