package cBST;

public class kLargestBST {

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		BSTclass bst = largestBSTSubtree(root, 0);
		return bst.largestHeight;
	}

	public static BSTclass largestBSTSubtree(BinaryTreeNode<Integer> root, int a) {
		
		if (root == null) {
			BSTclass bst = new BSTclass();
			bst.largestHeight = 0;
			bst.isBST = true;
			bst.maximum = Integer.MIN_VALUE;
			bst.minimum = Integer.MAX_VALUE;
			return bst;
		}
		
		BSTclass ans = new BSTclass();
		
		BSTclass left = largestBSTSubtree(root.left, 0);
		BSTclass right = largestBSTSubtree(root.right, 0);
		
			if (root.data > left.maximum && root.data < right.minimum && left.isBST && right.isBST) {
				ans.largestHeight = Math.max(left.largestHeight, right.largestHeight)+1;
				ans.isBST = true;
				ans.maximum = Math.max(root.data, right.maximum);
				ans.minimum = Math.min(root.data, left.minimum);
				return ans;
			} 
			
			ans.largestHeight = Math.max(left.largestHeight, right.largestHeight);
			ans.isBST = false;
			ans.maximum = Math.max(root.data, right.maximum);
			ans.minimum = Math.min(root.data, left.minimum);
			return ans;
		
	}

}

class BSTclass{
	boolean isBST;
	int largestHeight;
	int maximum;
	int minimum;
}