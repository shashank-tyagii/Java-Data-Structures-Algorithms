// Selection Sort

package hSortingAndSearching;
public class bSelectionSort {

	public static void swap (int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}
	
	 public static void selectionSort(int[] arr) {
	    
		 for (int i = 0; i< arr.length -1; i++) {
			 int min = arr[i];
			 int index = i;
			 for (int j = i+1; j < arr.length; j++) {
				 if (arr[j] < min) {
					 min = arr[j];
					 index = j;
				 }
			 }
			 if (index != i) {
			 swap(arr, i, index);}
		 }
		 
	    }  
	 
	public static void main(String[] args) {
		int [] arr = {2, 4,1,7,3,9,5};
		selectionSort(arr);
		print(arr);

	}

}
