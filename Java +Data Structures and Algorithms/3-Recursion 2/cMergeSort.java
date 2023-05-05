package cRecursion2;

public class cMergeSort {

	public static void mergeSort(int[] input){
		mergeSort(input, 0, input.length-1);
		
	}
    public static void mergeSort(int[] input, int start, int end){
		
		if (start>= end) {
			return;
		}		
		int mid = (start+end)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end);
		
		merge(input, start,mid, end);
		
	}
	
	public static void merge(int[] input , int start, int mid , int end) {
		
		int i = start;
		int j = mid+1 ;
		
		int[] temp = new int[end-start+2];
		int k=0;
		
		while (i <mid+1 && j <= end) {
			if (input[i] < input[j]) {
				temp[k] = input[i]; i++;
			} else if (input[i] >=  input[j]) {
				temp[k] = input[j]; j++;
			}
			k++;
		}
		
		while (i<mid+1) {
			temp[k] = input[i]; i++;k++;
		}
		
		while (j <= end) {
			temp[k] = input[j]; j++;k++;
		}
		
		for (int p = start; p <=end; p++) {
			input[p] = temp[p-start];
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
