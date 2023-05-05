package bBinaryTrees;

public class qInPrePostOrderTraversal {

	public static void Inorder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	
	
}
