package cBST;

public class hLCAinBST {

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		if (root == null) {
			return -1;
		}

		int left = getLCA(root.left, a, b);
		int right = getLCA(root.right, a, b);
		if (left != -1) {
			return left;
		}

		if (right != -1) {
			return right;
		}
		if (searchInBST(root, a) && searchInBST(root, b)) {
			return root.data;
		} 
	
		return -1;
	}
	
	
public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		
		if(root == null) {
			return false;
		}
		
		if (root.data == k) {
			return true;
		}
		
		boolean ans = false;
		if (k > root.data) {
			ans = searchInBST(root.right, k);
		} else {
			ans = searchInBST(root.left, k);
		}
		
		return ans;
	}
}
