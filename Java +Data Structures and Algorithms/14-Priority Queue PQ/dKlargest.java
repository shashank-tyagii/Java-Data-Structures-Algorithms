package ePriorityQueuePQ;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class dKlargest {

	public static ArrayList<Integer> kLargest(int input[], int k) {
	
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); 
		for (int i = 0; i < input.length; i++) {
			maxPQ.add(input[i]);
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i <k; i++ ) {
			ans.add(maxPQ.remove());
		}
		return ans;
	}
	
	public static ArrayList<Integer> kLargest2(int input[], int k) { 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
		
		for(int i = 0; i < k; i++) { 
			pq.add(input[i]); 
			} 
		
		for(int i = k; i < input.length; i++) { 
			if(input[i] > pq.peek()) {         
				pq.poll(); 
				pq.add(input[i]); 
				} 
			} 
		
		ArrayList<Integer> output = new ArrayList<Integer>(); 
		
		while(!pq.isEmpty()) { 
			output.add(pq.poll()); 
			} 
		
		return output; 
		}
}
