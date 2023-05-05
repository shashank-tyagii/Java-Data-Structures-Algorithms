// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
package gArrays;
public class jFindDuplicate {

	 public static int findDuplicate(int[] arr){
		int num = Integer.MIN_VALUE;
		 for (int i = 0; i<= arr.length-1; i++) {
			 for (int j= i+1; j < arr.length; j++) {
				 if (arr[i]== arr[j]) {
					 return arr[i];
				 }
			 }
		 }
		 return num;
			
	    }
	public static void main(String[] args) {
		
		 int[] arr={1,3,5,7,9,7,4};
		  int num = findDuplicate(arr);
		  System.out.println(num);

	}

}
