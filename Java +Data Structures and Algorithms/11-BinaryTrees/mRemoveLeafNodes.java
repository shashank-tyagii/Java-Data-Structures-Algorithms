package bBinaryTrees;

public class mRemoveLeafNodes {

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if (root == null) {
			return null;
		}
		
		if (root.left == null && root.right == null) {
			return null;                    // It is a leaf
		}
	
		root.left= removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		
		return root;
		
	}
}
