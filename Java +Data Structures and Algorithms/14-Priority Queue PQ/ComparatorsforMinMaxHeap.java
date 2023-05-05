package ePriorityQueuePQ;
import java.util.Comparator;
import java.util.PriorityQueue;
public class ComparatorsforMinMaxHeap {

	public static void main(String[] args) {
		
		String arr[] = {"this", "at", "a", "their", "queues"};
		StringLengthComparator stringComparator = new StringLengthComparator();
		PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	
		//MinPQComparator minComparator = new MinPQComparator();
//		MaxPQComparator maxPQComparator = new MaxPQComparator();
//		PriorityQueue<Integer> pq = new PriorityQueue<>(maxPQComparator);
		
	//	int arr[] = {9,1,0,4,7,3};
		for(int i = 0; i < arr.length; i++){
			pq.add(arr[i]);
		}

		//	System.out.println(pq.element());
		while(! pq.isEmpty()){
			System.out.print(pq.remove() + " ");
		}
}
}

class MinPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2){
			return -1;
		}else if(o1 > o2){
			return 1;
		}
		return 0;
	}

}

class MaxPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2){
			return 1;
		}else if(o1 > o2){
			return -1;
		}
		return 0;
	}

}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()){
			return 1;
		}else if(o1.length() > o2.length()){
			return -1;
		}else{
			return 0;
		}
	}
	
}

