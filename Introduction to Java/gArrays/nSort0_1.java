// You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
package gArrays;
public class nSort0_1 {
	
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}
	public static void sortZeroesAndOne(int[] arr) {
    	
//		for (int i = 0; i <arr.length-1; i++) {
//			for (int j =i+1; j <arr.length; j++) {
//				if (arr[i] ==1 && arr[j] == 0) {
//						 arr[i] = 0;
//						 arr[j] = 1;
//						 break;
//				}
//			}
		//Method 2
//		int i =0, j= arr.length-1;
//		while (i<j) {
//			if (arr[i]==1 && arr[j] ==0) {
//				arr[i] = 0; arr[j] = 1;
//				i++; j--;
//			} else if (arr[i] ==1) {
//				j--;
//			} else if(arr[i] == 0) {
//				i++;
//			}
//			else if (arr[i] == 0 && arr[j] == 1) {
//				i++;
//				j--;
//			}
//		}
			int nextZero = 0; 
			for(int i = 0; i < arr.length; i++) { 
				if(arr[i] == 0) {                  // Only search for 0
					int temp = arr[nextZero]; 
					arr[nextZero] = arr[i]; 
					arr[i] = temp; 
					nextZero += 1; } }            // Only increment after replacing with 0
		print(arr);
		
		
    }

	public static void main(String[] args) {
		
		int[] arr = {0,1,1,0,1,0,1,1};
		sortZeroesAndOne(arr);
		

	}

}
