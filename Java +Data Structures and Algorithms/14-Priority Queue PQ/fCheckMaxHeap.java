package ePriorityQueuePQ;

public class fCheckMaxHeap {
	public static boolean checkMaxHeap(int arr[], int index) {
		
		int leftChild = 2 * index +1;
		int rightChild = 2 * index +2;
		
		boolean left = true;
		boolean right = true;
		
		if (leftChild < arr.length) {
			if (arr[leftChild] > arr[index]) {
				return false;
			}
			left = checkMaxHeap(arr, leftChild);
		}
		
		if (rightChild < arr.length) {
			if (arr[rightChild] > arr[index]) {
				return false;
			}
			right = checkMaxHeap(arr, rightChild);
		}
		
		return left&& right;
	}
}
