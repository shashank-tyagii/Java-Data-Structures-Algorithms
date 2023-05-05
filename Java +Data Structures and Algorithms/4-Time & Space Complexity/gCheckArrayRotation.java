// You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
// Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.
package dTimeSpaceComplexity;

public class gCheckArrayRotation {

	public static int arrayRotateCheck(int[] arr){
    	if (arr.length == 0) {
    		return 0;
    	}
    	
    	
    	for (int i=0; i <arr.length-1; i++) {
    		if (arr[i+1]< arr[i]) {
    			return i+1;
    		}
    	}
		
		
		return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
