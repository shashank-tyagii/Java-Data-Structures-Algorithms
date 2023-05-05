package bBinaryTrees;

public class nIsBalanced {
 
	// A Tree is balanced if the difference of heights at any node is less than 1
	
	// Method 1
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(rightHeight-leftHeight) > 1) {
			return false;
		}
		
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}
	
	public static BalancedTreePair isBalancedBetter(BinaryTreeNode<Integer> root) {
	
		if (root == null) {
			BalancedTreePair temp = new BalancedTreePair();
			temp.height = 0;
			temp.isBalanced = true;
			return temp;
		}
		
		boolean isBal = true;
		
		BalancedTreePair leftPair = isBalancedBetter(root.left);   // It will return the height on left side and tell whether left side is balanced or not
		BalancedTreePair rightPair = isBalancedBetter(root.right); // It will return the height on left side and tell whether left side is balanced or not
		
		int height = 1 + Math.max(leftPair.height, rightPair.height);  // Height will add 1
		
		
		if (Math.abs(leftPair.height - rightPair.height) >1 ){       // If height didn't match
			isBal = false;
		}
		
		if (leftPair.isBalanced == false || rightPair.isBalanced == false) {  // If any one of the side is not balanced
			isBal =  false;
		}
		
		BalancedTreePair ans = new BalancedTreePair();
		ans.height = height;
		ans.isBalanced = isBal;
		
		return ans;
		
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int height1 = height(root.left);
		int height2 = height(root.right);
		
		return 1 + Math.max(height1, height2);
	}
	
}

	   class BalancedTreePair {
		int height;
		boolean isBalanced;
	}
