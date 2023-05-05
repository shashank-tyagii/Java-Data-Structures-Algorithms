package bBinaryTrees;

public class jReplaceNodeWithDepth {
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeToDepthTree(root,0);
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root, int count) {
	    if (root == null) {
	    	return;
	    }
	    
	    root.data = count;
	    changeToDepthTree(root.left, count+1);
	    changeToDepthTree(root.right, count+1);
	    
	}
}
