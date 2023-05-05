// Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
package aaTrees;

public class bNodeWithMaxSum {

//	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
//		if (root == null) {
//			return null;
//		}
//		if (root.children.size() == 0) {
//			return root;
//		}
//	
//		int max = calculateSum(root);
//		TreeNode<Integer> output = root;
//		
//		for (int i =0; i <root.children.size(); i++) {
//			TreeNode<Integer> temp = maxSumNode(root.children.get(i));
//			int tempSum = calculateSum(temp);
//			if (tempSum > max) {
//				max = tempSum;
//				output = temp;;
//			}
//			
//		}
//				
//		return output;
//	}
//	
//	public static int calculateSum(TreeNode<Integer> root) {
//		int sum = root.data;
//		
//		for (int i =0; i <root.children.size(); i++) {
//			sum = sum + root.children.get(i).data;
//		}
//		
//		return sum;
//	}
//	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here
        return maxSumNode(root, 0);
    }
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root, int maxSum){
	    
	    if(root.children.size() == 0){
	        return null;
	        
	    }
	    
	    TreeNode<Integer> maxNode = null;
	    int tempSum = root.data;
	    for(int i = 0 ; i < root.children.size() ; ++i){
	        tempSum += root.children.get(i).data;
	    }
	    if(tempSum > maxSum){
	        maxSum = tempSum;
	        maxNode = root;
	        
	    }
	    //System.out.println("MaxNum now for "+root.data+" is: "+ maxSum);
	    
	    for(int i = 0 ; i < root.children.size() ; ++i){
	        TreeNode<Integer> temp = maxSumNode(root.children.get(i), maxSum);
	        if(temp == null){
	            continue;
	        }
	        if(temp != null){
	            maxNode = temp;
	        }
	    }
	    return maxNode;
	}
	
	
	
	
}
