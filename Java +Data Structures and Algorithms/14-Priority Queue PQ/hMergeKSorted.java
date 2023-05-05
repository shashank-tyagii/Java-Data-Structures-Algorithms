package ePriorityQueuePQ;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class hMergeKSorted {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input)  {
        ArrayList<Integer> ary=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int i=0;i<input.size();i++){
      ArrayList<Integer> temp=input.get(i);
      for(int j=0;j<temp.size();j++)
          pq.add(temp.get(j));
      	}
    
       while(!pq.isEmpty())
            ary.add(pq.remove());
        return ary;
    }
	
	
	
}

class mergeArrays{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) { 
		if (input.size()==0){ return null; } 
		
		PairComparator compare = new PairComparator(); 
		PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>(input.size(), compare); 
		
		for(int i = 0; i < input.size(); i++) { 
			int index = input.get(i).size() - 1; 
			Pair current = new Pair(input.get(i).get(index), i); 
			maxHeap.add(current); input.get(i).remove(index); 
			} 
		
		ArrayList<Integer> output = new ArrayList<Integer>(); 
		
		while(!maxHeap.isEmpty()) { 
			Pair max = maxHeap.remove(); 
			output.add(max.value); 
			int i = max.arrayNumber; 
			if(input.get(i).size() > 0) { 
				int index = input.get(i).size() - 1; 
				int value = input.get(i).get(index); 
				input.get(i).remove(index); 
				Pair current = new Pair(value, i); 
				maxHeap.add(current); 
				} 
			} 
		
		Collections.reverse(output); 
		return output; 
		}
}
class PairComparator implements Comparator<Pair> { 
	public int compare(Pair p1, Pair p2) { 
		if(p1.value <= p2.value) 
			return 1; 
		else 
			return -1; 
		} 
	} 

class Pair { 
	int value; 
	int arrayNumber; 
	Pair(int v, int n) { 
		value = v; 
		arrayNumber = n; 
		} 
	}