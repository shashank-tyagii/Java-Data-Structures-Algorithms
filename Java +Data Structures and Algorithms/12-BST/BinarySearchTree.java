package cBST;

public class BinarySearchTree {

	private BinaryTreeNode<Integer> root;

	public void insert(int data) {
		root = insertDataHelper(data, root);
	}
	
	private BinaryTreeNode<Integer> insertDataHelper(int data,BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(data);
			return temp;
		}
		
		if (data <= root.data) {
			root.left = insertDataHelper(data, root.left);
		} else {
			root.right= insertDataHelper(data, root.right);
		}
		
		return root;
	}
	
	public void remove(int data) {
	root = deleteDataHelper(data, root);
	}
	
	private BinaryTreeNode<Integer> deleteDataHelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		
		if (root.data == data) {
			if (root.left == null && root.right == null) {
				return null;
			} else if ( root.left != null && root.right == null) {
				return root.left;
			} else if (root.right != null && root.left == null) {
				return root.right;
			} else {
				// calculate maximum on left side OR minimum on right side
				// Replace the root data with the maximum on left side and delete that node
				int min= minimum(root.right);
				root.data = min;
				root.right = deleteDataHelper(min, root.right);
				return root;
			}
			
		}
		
		if (data < root.data) {
			root.left = deleteDataHelper(data, root.left);
		} else {
			root.right = deleteDataHelper(data, root.right);
		}
		
		return root;
	}
	
	public int minimum(BinaryTreeNode<Integer> node)
	{
	    /* loop down to find the rightmost leaf */
		BinaryTreeNode<Integer> current = node;
	    while (current.left != null)
	        current = current.left;
	     
	    return (current.data);
	}
	public void printTree() {
		print(root);
	}

	public void print(BinaryTreeNode<Integer> root) {
		//Implement the printTree() function
		if (root == null) {
			return;
		}
		String toBePrinted= root.data + ":";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data ;
		}
		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
	}
	
	public boolean search(int data) {
		return hasDataHelper(data, root);
	}
	
	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return false;
		}
		
		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			// call right
			return hasDataHelper(data, root.right);
		} else {
			// call left
			return hasDataHelper(data, root.left);
		}
	}
	

}