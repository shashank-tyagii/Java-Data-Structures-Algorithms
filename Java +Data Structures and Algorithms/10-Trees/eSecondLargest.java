package aaTrees;

import java.util.ArrayList;

public class eSecondLargest {

//	 
//		// Pointers to store the largest and second largest node
//	    public static TreeNode<Integer> largest;
//	    public static TreeNode<Integer> secondLargest;
//	  
//	    // Helper Function to find the second largest node of the n-ary tree
//	    public static void findSecondLargestHelper(TreeNode<Integer> root)
//	    {
//	        // Base Case
//	        if (root == null) {
//	            return;
//	        }
//	         
//	        // Check if root's data is larger than current largest node's data
//	        if (root.data > largest.data) {
//	            secondLargest = largest;
//	            largest = root;
//	        } else if (root.data > secondLargest.data && root.data != largest.data)
//	            secondLargest = root;
//	         
//	        // recursively find second largest in children
//	        for (TreeNode<Integer> child: root.children)
//	            findSecondLargestHelper(child);
//	    }
//	     
//	    // Function to find the second largest node of the n-ary tree
//	    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
//	    {
//	       
//	        // Initialising the pointers to a node with value negative infinity
//	        largest = new TreeNode<Integer>(Integer.MIN_VALUE);
//	        secondLargest = largest;
//	         
//	        findSecondLargestHelper(root);
//	        return secondLargest;
//	    }
//		
//		
	
	
	static class Pair<T>{    // Custom class for storing maximum and second maximum of each Node
		T first; 
		T second; 
		Pair(T first, T second){ 
			this.first = first; 
			this.second = second; 
			} 
		} 
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){ 
		return findSecondLargestHelper(root).second; 
		} 
	
	public static Pair<TreeNode<Integer>> findSecondLargestHelper(TreeNode<Integer> root){ 
		
		Pair<TreeNode<Integer>> output; 
		
		if(root == null){ 
			output = new Pair<TreeNode<Integer>>(null,null); 
			return output; 
			} 
		
		output = new Pair<TreeNode<Integer>>(root, null); 
		
		for(TreeNode<Integer> child : root.children){  
			Pair<TreeNode<Integer>> childPair = findSecondLargestHelper(child); 
			if(childPair.first.data > output.first.data){ 
					if(childPair.second == null || childPair.second.data < output.first.data){ 
						output.second = output.first; 
						output.first = childPair.first; 
						} else { 
							output.first = childPair.first;
							output.second = childPair.second; 
						} 
				} else if(childPair.first.data.equals(output.first.data) && childPair.second != null) { 
						if(output.second == null || childPair.second.data>output.second.data){ 
							output.second = childPair.second; 
						} 
						} else if(output.first.data != childPair.first.data && (output.second == null ||childPair.first.data > output.second.data)) { 
							output.second = childPair.first; 
						} 
			} 
		return output; 
			}

}
