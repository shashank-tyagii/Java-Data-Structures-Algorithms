package skillTest3;

public class maxSumBST {

	 public static int maxSumBST(BinaryTreeNode<Integer> root) {
	        int[] maxSum = new int[]{0};
	        helper(root, maxSum);
	        return maxSum[0];
	    }
	    
	    private static int[] helper(BinaryTreeNode<Integer> root, int[] maxSum) {
	        // [isBST, min, max, sum]
	        if (root == null) {
	            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
	        }
	        int[] left = helper(root.left, maxSum);
	        int[] right = helper(root.right, maxSum);
	        int[] ret = new int[4];
	        if (left[0] == 1 && right[0] == 1 && root.data > left[2] && root.data < right[1]) {
	            ret[0] = 1;
	            ret[1] = Math.min(left[1], root.data);
	            ret[2] = Math.max(right[2], root.data);
	            ret[3] = root.data + left[3] + right[3];
	            maxSum[0] = Math.max(maxSum[0], ret[3]);
	        }
	        return ret;
	    }
}

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
