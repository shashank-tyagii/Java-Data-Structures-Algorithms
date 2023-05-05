// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
package dTimeSpaceComplexity;

public class bDuplicateInArray {

	public static int findDuplicate(int[] arr) {
		// Here the array contains the elements from zero to n
		// sum = n(n+1)/2
		// If there are 10 terms, calculate the sum of first 9 terms and subtract this sum from total terms of an array
		

		int n = arr.length;
		int arrSum =0;
		for (int i =0; i < n; i++) {
			arrSum +=arr[i];
		}
		
		int sumN = ((n-1)*(n-2))/2;
		return arrSum-sumN;
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
