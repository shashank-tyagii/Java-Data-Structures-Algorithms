package cBST;

import java.util.ArrayList;

public class nPairSumInBST {

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		
		if (root == null) {
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		arr= InconvertToArray(root, arr);            // o[n]
		
		int i = 0, j= arr.size()-1;
		while (i <j) {
			if (arr.get(i) + arr.get(j) == s) {
				System.out.println(arr.get(i) + " " + arr.get(j));
				i++; j--;
			} else if (arr.get(i) + arr.get(j) > s) {
				j--;
			} else {
				i++;
			}
		}
		
	}
	
	
	public static ArrayList<Integer> InconvertToArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
		
		if (root == null) {
			return null;
		}
		
		InconvertToArray(root.left, arr);
		arr.add(root.data);
		InconvertToArray(root.right, arr);
		
		return arr;
	}
}
