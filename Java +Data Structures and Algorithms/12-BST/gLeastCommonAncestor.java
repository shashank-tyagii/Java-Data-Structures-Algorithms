package cBST;

public class gLeastCommonAncestor {
	
//  1. If out of 2 nodes only one node is present, return that node. 
//	2. If both are not present, return -1.
		
	static BinaryTreeNode<Integer> getLCA2(BinaryTreeNode<Integer> root, int a, int b) {
	  if (root==null) { 
		return null; 
		} 
	  
	  if (root.data == a || root.data == b) {   // If any element is at the root, then this will be the answer because second data will be somewhere in the tree
		   return root; 
		  } 
	  BinaryTreeNode<Integer> leftLCA = getLCA2(root.left, a, b); 
	  BinaryTreeNode<Integer> rightLCA = getLCA2(root.right, a, b); 
	  
	  if ((leftLCA != null) && (rightLCA != null) ) { // One data is found on left side and one on the right side
		  return root; 
		  } 
	  
	  if (leftLCA != null) {               // Both data are found on left side
		  return leftLCA; 
		  } 
	  
	  return rightLCA;                    // Both data are found on right side
	  
	}
	
}
