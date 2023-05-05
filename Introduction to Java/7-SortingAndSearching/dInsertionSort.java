// Insertion sort
// We have two divisions = sorted and unsorted
// we pick one from unsorted and place at it's place in unsorted
package hSortingAndSearching;
public class dInsertionSort {

	public static void insertionSort(int[] arr) {
    	for (int i =1; i <arr.length ; i++) {
    		for (int j = i ; j>0; j--) {
    			if (arr[j-1] > arr[j]) {
    				swap(arr,j,j-1);
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int [] arr = {2, 4,1,7,3,9,5};
		insertionSort(arr);
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
