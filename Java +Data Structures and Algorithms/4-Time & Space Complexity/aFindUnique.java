// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.
package dTimeSpaceComplexity;

import java.util.Arrays;

public class aFindUnique {

	
	public static int findUnique(int[] arr) { 
		int XOR = 0; 
		for(int i = 0; i < arr.length; i++) { 
			XOR ^= arr[i];                     //Bitwise XOR Property : a^a = 0  and a^b^a = b, same bits cancel each other
			} 
		
		return XOR; 
			}
	
	
	// Time complexity = n log n + n
	public static int findUnique2(int[] arr) {
		Arrays.sort(arr);
		
		for (int i =0; i < arr.length; i = i+2) {
            
            if (i == arr.length-1){
                return arr[i];
            } else  if (arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
