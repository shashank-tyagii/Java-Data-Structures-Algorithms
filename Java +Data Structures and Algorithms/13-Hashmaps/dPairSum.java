package dHashmaps;

import java.util.HashMap;
import java.util.Set;

public class dPairSum {

	public static int PairSum(int[] input, int size) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// Store the frequencies
		for (int i =0; i < input.length ; i++) {
			if (map.containsKey(input[i])) {
				 map.put(input[i],map.get(input[i])+1);
			 } else {
				 map.put(input[i], 1);
			 }
		}
		
		int count = 0;
		Set<Integer> keys =  map.keySet();
		for (int num : keys) {
			// Check if it's negative number is available
			// If yes, multiply the occurances and add to count
			if (num != 0 && map.containsKey(-num) && map.get(num) != 0 ) {
				count = count  + map.get(num) * map.get(-num);
				map.put(num, 0);
				map.put(-num, 0);
			} else if (num ==0){
					int occurrences = map.get(num);
                  	int   times = (occurrences * (occurrences - 1)) / 2;
                    count += times;
                    map.put(num, 0);
			}
		
	}
		return count;
}
}
