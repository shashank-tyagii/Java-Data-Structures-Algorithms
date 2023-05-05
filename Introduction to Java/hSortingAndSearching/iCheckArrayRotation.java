//You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
// Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.
// 10 20 30 40 1 ==> 4 about 4th index, it is rotated
package hSortingAndSearching;

public class iCheckArrayRotation {

	public static int arrayRotateCheck(int[] arr){
    	int count =0;
    	for (int i =1; i< arr.length; i++) {
    		if (arr[i] < arr[i-1]) {
    			count = i+1;
    			break;
    		} 
    		if (arr[i] > arr[i-1] && i == arr.length-1) {
    			count =0;
    		}
    	}
    	return count;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {5,6,7,1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5,6,7};
		int[] arr3 = {5,6,7,8,9,10,1};
		
		
		int count1 = arrayRotateCheck(arr1);
		int count2 = arrayRotateCheck(arr2);
		int count3 = arrayRotateCheck(arr3);
		
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);

	}

}
