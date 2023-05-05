// Bubble sort
package hSortingAndSearching;
public class cBubbleSort {

	public static void bubbleSort(int[] arr){
    	for (int i =0; i < arr.length -1; i++) {
    		for (int j =0; j <arr.length-i-1 ; j++) {
    			if (arr[j] > arr[j+1]) {
    				swap(arr, j, j+1);
    			}
    		}
    	}
    } 
	public static void main(String[] args) {
		int [] arr = {2, 4,1,7,3,9,5};
		bubbleSort(arr);
		print(arr);
	}
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

}
