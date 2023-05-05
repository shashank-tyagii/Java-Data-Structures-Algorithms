// You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.

package hSortingAndSearching;
public class jSort012 {

	 public static void sort012(int[] arr){
	    
		 int i =0;
		 int zeroPos = 0;
		 int twoPos = arr.length-1;
		 
		 while (i <= twoPos) {
			 if (arr[i] == 0) {
				 swap(arr, i, zeroPos);
				 zeroPos++;
				 i++;         // because the new element came from back will not be 2, it will be only zero or 1
			 } else if (arr[i] == 1) {
				 i++; 
			 } else if (arr[i] ==2) {
				 swap(arr, i, twoPos);
				 twoPos--;   // We will not increment i, as new element can be two again.
			 }
		 }
        for (int k = zeroPos; k<=twoPos ; k++) {           // Add 1 to remaining 
			  arr[k]=1;
		  }
		 
		 
		 
		 
		 
		 
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void swap (int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
