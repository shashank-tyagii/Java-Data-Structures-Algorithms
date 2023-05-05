// You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.

package gArrays;
public class mTripletSum {

	 public static int findTriplet(int[] arr, int x) {
	    	int count = 0;
	    	
	    	for (int i =0; i <arr.length-2; i++) {
	    		for (int j = i+1; j<arr.length-1; j++) {  // Next term in array
	    			for (int k =j+1; k<arr.length; k++){  // Next term in array
	    				if (arr[i] + arr[j] + arr[k] == x) {
	    					count++;
	    				}
	    			}
	    		}
	    	}
	    	
	    	return count;
	    } 
	 
	public static void main(String[] args) {
		int[] arr = {2,8,-5,-6,0,5,10,11,-3};
		int x =10;
		int count = findTriplet(arr, x);
		System.out.println(count);

	}

}
