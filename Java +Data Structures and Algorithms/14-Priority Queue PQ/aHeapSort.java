package ePriorityQueuePQ;

import java.util.PriorityQueue;

public class aHeapSort {

	public void heapSort(int[] array) {
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for(int i=0; i<array.length; i++){
            heap.add(array[i]);
        }
        for(int i=0; i<array.length; i++){
            array[i] = heap.remove();
        }
	}
}
