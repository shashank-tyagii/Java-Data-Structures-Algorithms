// You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
package gArrays;

public class lPairSum {

	 public static int pairSum(int arr[], int x) {
		 int count =0;
		 int[] narr = new int[arr.length];
		 narr = arr;
	    	for (int i =0; i <narr.length-1;i++) {
	    		for (int j = i+1; j<narr.length ; j++) {
	    			if (narr[i]+narr[j] == x) {
	    				count++;
	    			}
	    		}
	    	}
	    	return count;
	    }
	public static void main(String[] args) {
		
		int[] arr = {2,8,10,5,-1,5};
		int x = 10;
        int count = pairSum(arr, x);
        System.out.println(count);
	}

}
