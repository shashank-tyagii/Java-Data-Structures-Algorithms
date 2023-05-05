package dHashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class gLongestConsecutiveSequence {

public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int longestSeq = -1;
		
		 for (int i =0; i < arr.length; i++) {
			 if (map.containsKey(arr[i])) {
				 map.put(arr[i],map.get(arr[i])+1);
			 } else {
				 map.put(arr[i], 1);
			 }
		 }
		 // 3 7 2 1 9 8 41 --- 7 9
		 ArrayList<Integer> list = new ArrayList<>();
		 
		 for (int i = 0; i < arr.length ; i++) {
			 
			 int firstElement = arr[i];
			 int j =arr[i];
			 int count = 0;
			 
			 while (map.containsKey(j)) {
				// map.put(j, 0);
				 j++;
				 count++;
			 }
			 j--;
			
			 if (count> longestSeq) {
				 longestSeq = count;
				 if (!list.isEmpty()) {
					 list.removeAll(list);
				 }
				 list.add(firstElement);
				 if (arr[i] != j) {
				 list.add(j);}
			 }
			 	 
		 }
		 
		return list;
    }
}
