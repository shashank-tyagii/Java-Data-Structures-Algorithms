// Quick Sort
package cRecursion2;
public class dQuickSort {

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length-1);
		
	}
    public static void quickSort(int[] input, int start, int end) {
		
		if (start>= end) {
			return;
		}
		
		int pivotIndex = partition(input, start, end);  // This will divide the array into two parts 
		quickSort(input, start, pivotIndex-1);
		quickSort(input, pivotIndex+1, end);
		
	}
	
	public static int partition(int[] input , int start, int end) {
		
		int pivot = input[start];                   // Identify pivot
		int count =0;
		for (int i =start+1; i <=end; i++) {
			if (input[i] <= pivot) {
				count++;
			}
		}
		int pivotIndex = start+count;
		swap (input, start, pivotIndex);                   // Move pivot to it's position
		
		int i =start;
		int j = end;
		
		while (i < pivotIndex && j > pivotIndex) {
			if (input[i] > pivot && input[j] <= pivot) {
				swap(input, i,j);
				i++ ; j--;
			} else if (input[i] > pivot) {
				j--;
			} else if (input[j] <= pivot) {
				i++;
			} else if (input[i] <= pivot) {
				i++;
			} else if (input[j] > pivot) {
				j--;
			}
			
		}
		return pivotIndex;
	}
    public static void swap (int[] input, int pos1, int pos2) {
		int temp = input[pos1];
		input[pos1]= input[pos2];
		input[pos2] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
