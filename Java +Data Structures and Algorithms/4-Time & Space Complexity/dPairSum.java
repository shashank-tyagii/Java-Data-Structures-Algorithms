// You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs(not subsets) in the array/list which sum to 'num'.
// You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
package dTimeSpaceComplexity;

import java.util.Arrays;

public class dPairSum {

	public static int pairSum(int[] arr, int num) { 
		Arrays.sort(arr); 
		int startIndex = 0; 
		int endIndex = (arr.length - 1); 
		
		int numPair = 0; 
		
		while(startIndex < endIndex) { 
			if(arr[startIndex] + arr[endIndex] < num) {
				startIndex++; 
				} else if (arr[startIndex] + arr[endIndex] > num) { 
					endIndex--; 
					} 
			else {
				int elementAtStart = arr[startIndex]; 
				int elementAtEnd = arr[endIndex]; 
				if (elementAtStart == elementAtEnd) { 
					int totalElementsFromStartToEnd = (endIndex - startIndex) + 1; 
					numPair += (totalElementsFromStartToEnd * (totalElementsFromStartToEnd - 1) / 2); 
					return numPair; 
					} 
				int tempStartIndex = startIndex + 1; int tempEndIndex = endIndex - 1; 
				while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
					tempStartIndex += 1; 
					} 
				while(tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) { 
					tempEndIndex -= 1; 
					} 
				int totalElementsFromStart = (tempStartIndex - startIndex); 
				int totalElementsFromEnd = (endIndex - tempEndIndex); 
				numPair += (totalElementsFromStart * totalElementsFromEnd); 
				startIndex = tempStartIndex; endIndex = tempEndIndex; 
				} 
			} return numPair; 
			}
	
	
	
//	public static int pairSum(int[] arr, int num, int start, int pair) {
//	  int sum = 0;
//      
//      for(int i = 0; i<arr.length; i++){
//          for(int j = i+1; j<arr.length; j++){
//              if(arr[i] + arr[j] == num){
//                  sum+=1;
//              }
//          }
//      }
//      return sum; }
	
	
//	public static int pairSum(int[] arr, int num, int start, int pair) {  // Pair, because we don't need subsets, we need only pairs
//		
//		if (num ==0) {
//			System.out.println( "" + num +"    >>" +  start);
//			return 1;
//		} 
//		if (pair == 0) {
//			return 0;
//		}
//		
//		if (start >= arr.length) {
//			return 0;
//		}
//		if (num < 0) {
//			return 0;
//		}
//				
//		int n1 = pairSum(arr, num, start+1, pair);
//		int n2 = pairSum(arr, num-arr[start], start+1,pair-1);
//		
//		return n1+n2;
//	}
	
	public static void main(String[] args) {
		int[] arr = { 1,3,6,2,5,4,3,2,4};
		int n = pairSum(arr, 7);
		System.out.println(n);

	}

}
