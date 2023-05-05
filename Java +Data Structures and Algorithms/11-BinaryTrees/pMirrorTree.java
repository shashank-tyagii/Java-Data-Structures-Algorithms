package bBinaryTrees;

public class pMirrorTree {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		
		if (root == null) {
			return;
		}
		
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		
	}
}
