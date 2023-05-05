// You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
package dTimeSpaceComplexity;

public class fRotateArray {

	// Method 1
	public static void rotate(int[] arr, int d) {
    	
		  
				int[] temp = new int[d];                       
				for (int i =0; i < temp.length; i++) {        // Copy first few elements in a seperate array
					temp[i] = arr[i];
				}
				
				for (int i =0 ; i <arr.length-d; i++) {       // Shift by d distance
					arr[i] = arr[i+d];
				}
				
				for (int i = 0; i < temp.length; i++) {      // Copy the temp array at the end
					arr[arr.length-d+i] = temp[i];
				}	
		
    }
	
	// Method 2
	public static void rotate2(int[] arr, int d) {
		if (arr.length==0){
            return;
        }
        
        if (d >= arr.length && arr.length != 0) { 
        	d %= arr.length; 
        	}
        
		int i =0;
		int j = arr.length-1;
		reverse(arr,i,j);                    // Reverse full array
		
		reverse (arr,i,j-d);
		reverse (arr, j-d+1,j);
		
		
		
	}
	public static void reverse(int[] arr, int start, int end) {
		int i = start;
		int j= end;
		while (i<j) {                   // Reverse full array
			swap(arr,i,j);
			i++; 
			j--;
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = arr[i];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
