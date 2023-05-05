package ePriorityQueuePQ;
import java.util.Arrays;
import java.util.PriorityQueue;
public class gKthLargest {

		
		public static int kthLargest(int n, int[] input, int k) { 
			// Making a min PQ 
			PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
			//The size of PQ will be k 
			
			for (int i = 0; i < k; i++) {
				minHeap.add(input[i]); 
				} 
			
			for (int i = k; i < n; i++) { 
				if (input[i] > minHeap.peek()) { 
					minHeap.poll();
					minHeap.add(input[i]); 
					} 
				} 
			
			return minHeap.peek(); 
			}
		}
	
	
