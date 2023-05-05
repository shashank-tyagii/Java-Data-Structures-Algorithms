package cBST;
import java.util.ArrayList;
import java.util.Collections;

public class iPairSumBinaryTree {

	// Convert Binary tree to Array
	// Sort the array
	// Find the Pairs
	// o[nlogn] 
	static void pairSum(BinaryTreeNode<Integer> root, int sum) {
		if (root == null) {
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		arr= convertToArray(root, arr);            // o[n]
		Collections.sort(arr);                     // o[nlogn]
		pairSum(arr, sum);                         // o[n]
		
	}
	
	 public static void pairSum(ArrayList<Integer> arr, int x) {
	       
	       int i =0;
	       int j = arr.size()-1;
	       
	       while (i <j) {
	    	   
	    	   if (arr.get(i) + arr.get(j) == x) {
	    		   System.out.println(arr.get(i) + " " +  arr.get(j));
	    		   i++; j--;
	    		   
	    	   } else if (arr.get(i) + arr.get(j) > x) {
	    		   j--;
	    		   
	    	   } else if (arr.get(i) + arr.get(j) < x) {
	    		   i++;
	    	   }
	    	   
	       }
	    }
	 
	 
	 
	public static ArrayList<Integer> convertToArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
		
		if (root == null) {
			return null;
		}
		arr.add(root.data);
		convertToArray(root.left, arr);
		convertToArray(root.right, arr);
		
		return arr;
	}
	
}
