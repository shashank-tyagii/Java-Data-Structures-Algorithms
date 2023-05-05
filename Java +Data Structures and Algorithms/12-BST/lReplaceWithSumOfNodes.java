package cBST;

public class lReplaceWithSumOfNodes {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSum(root,0);

	}

	public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum) {
		if (root == null){
			return sum;
		}
		
		sum = replaceWithLargerNodesSum(root.right, sum);                 // Right side call
		sum = sum + root.data;                                      // Update the center
		root.data= sum;
		
		sum = replaceWithLargerNodesSum(root.left, sum);            // pass this to left side
		
		return sum ;
	}
	
	
}


