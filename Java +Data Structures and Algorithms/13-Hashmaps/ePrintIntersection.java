package dHashmaps;
import java.util.HashMap;

public class ePrintIntersection {

	public static void printIntersection(int[] arr1,int[] arr2){
		
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		
		for (int i = 0; i < arr1.length; i++) {
			if (map1.containsKey(arr1[i])) {
				map1.put(arr1[i], map1.get(arr1[i]) + 1);
				continue;
			}
			map1.put(arr1[i], 1);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if (map2.containsKey(arr2[i])) {
				map2.put(arr2[i], map2.get(arr2[i]) + 1);
				continue;
			}
			map2.put(arr2[i], 1);
		}
		
		
		for (int i =0; i < arr1.length; i++) {
			if (map1.containsKey(arr1[i]) && map2.containsKey(arr1[i]) && map1.get(arr1[i]) !=0 && map2.get(arr1[i])!=0) {
				System.out.println(arr1[i]);
				map1.put(arr1[i], map1.get(arr1[i])-1);
				map2.put(arr1[i], map2.get(arr1[i])-1);
			}
			
		}
		
	}
}
