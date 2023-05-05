package dHashmaps;

import java.util.HashMap;

public class fExtractUniqueCharacters {

	public static String uniqueChar(String str){
		
		HashMap<Character, Integer> map = new HashMap<>();
		String output = "";
		
		for (int i =0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				continue;
			}
		map.put(c, 1);
		output = output + c;
		}
		
		return output;
	}
}
