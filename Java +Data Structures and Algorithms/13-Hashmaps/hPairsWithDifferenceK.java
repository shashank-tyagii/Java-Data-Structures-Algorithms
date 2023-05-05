package dHashmaps;
import java.util.HashMap;
public class hPairsWithDifferenceK {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		 for (int i =0; i < arr.length; i++) {
			 if (map.containsKey(arr[i])) {
				 map.put(arr[i],map.get(arr[i])+1);
			 } else {
				 map.put(arr[i], 1);
			 }
		 }
		 
		 int count = 0;
		 for (int i =0; i < arr.length; i++) {
			 int num = arr[i];
			 if (k != 0 && map.containsKey(num+k)) {
				 count = count +  map.get(num) * map.get(num+k);
				 map.put(num, 0);
				// map.put(num-k, 0);
			 }else if (k==0) {
				 int value = map.get(num);
				 count = count + value * (value-1) /2;
				 map.put(num, 0);
			 }
			 
		 }
		 
		 return count;
		 
	}
	
}
