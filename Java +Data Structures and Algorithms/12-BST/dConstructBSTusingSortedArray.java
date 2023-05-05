package cBST;

public class dConstructBSTusingSortedArray {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		BinaryTreeNode<Integer> ans = SortedArrayToBST(arr, 0 , arr.length-1);
		return ans;
	}
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int startIndex, int endIndex){
			
		if (endIndex == startIndex) {
			BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[startIndex]);
		} else if(endIndex < startIndex) {
			return null;
		}
		
		int mid = (startIndex + endIndex)/2;
		int rootData = arr[mid];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		root.left = SortedArrayToBST(arr, startIndex, mid-1);
		root.right = SortedArrayToBST(arr, mid +1, endIndex);
		
		return root;
		
	}
}

