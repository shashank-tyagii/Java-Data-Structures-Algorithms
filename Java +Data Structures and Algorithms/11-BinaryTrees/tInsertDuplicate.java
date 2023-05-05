package bBinaryTrees;

public class tInsertDuplicate {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
		duplicate.left = root.left;
        duplicate.right = null;
		root.left = duplicate;
		
		insertDuplicateNode(duplicate.left);
		insertDuplicateNode(root.right);
	}
}
