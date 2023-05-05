package dHashmaps;

import java.util.HashMap;
import java.util.Set;

public class aInbuiltHashmap {

	// Treemap - data is stored in order in a BST and all operations are o[log n]
	// Hashmap - data is stored in Hashtables in an Insertion order and all operations are o[1]
	
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		// Insert keys 
		map.put("abc", 1);    // all operations on Key are o[1]
		map.put("def", 2);
		map.put("ghi", 3);
		map.put("jkl", 4);
		// Printing
		Set<String> keys =  map.keySet();  // Returns the set
		for (String str:keys) {
			System.out.print(str + ", ");
		}
		System.out.println();
		// Delete
		map.remove("ghi");     // o[1]
		
		// Contains key and value
		
		System.out.println(map.containsKey("abc"));  // o[1] for keys
		System.out.println(map.containsValue(2));    // o[n] *****
		
	}
}
