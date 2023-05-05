package ePriorityQueuePQ;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class eKsmallest {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k)  { 
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(); 
		for (int i = 0; i < input.length; i++) {
			maxPQ.add(input[i]);
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i <k; i++ ) {
			ans.add(maxPQ.remove());
		}
		return ans;
		}
}
