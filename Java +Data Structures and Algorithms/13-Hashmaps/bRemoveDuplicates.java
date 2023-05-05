package dHashmaps;
import java.util.ArrayList;
import java.util.HashMap;

public class bRemoveDuplicates {

	public static ArrayList<Integer> removeDuplicates(int[] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for (int i : arr) {
			if (map.containsKey(arr[i])) {
				continue;
			}
			list.add(arr[i]);
			map.put(arr[i], true);
			
		}
		return list;
	}
}
