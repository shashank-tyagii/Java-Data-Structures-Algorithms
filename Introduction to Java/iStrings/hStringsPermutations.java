// For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
// Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.
package iStrings;
public class hStringsPermutations {

	public static boolean isPermutation(String str1, String str2) {
		// Method 1 - Order [n^2]
		/*
		if (str1 =="" || str2 == "") {
			return true;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		
		boolean[] isMatched = new boolean[str2.length()];
		for (int i =0; i <str1.length(); i++) {
			for (int j =0; j <str2.length(); j++) {
			    if (isMatched[j] == true) {
			    	// skip this character, as already verified once
			    }
				else if (j == str2.length()-1 && str2.charAt(j) !=str1.charAt(i)) {
					return false;
				} else if (str2.charAt(j) ==str1.charAt(i)) {
					isMatched[j] = true;
					break;
				}
			}
		}
		
		return true; */
		// Method 2 - Order [3n]
		if (str1 =="" || str2 == "") {
			return true;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int[] frequency = new int[256];     // All the ASCII numbers can come into it
		
		for (int i =0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			++ frequency[ch];             // Lets say 'a' has 98 ASCII, so at 98th, increase by 1
		}
		
		for (int i =0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			-- frequency[ch];             // Lets say 'a' has 98 ASCII, so at 98th, reduce it back by 1
		}
		
		for (int i =0; i < frequency.length; i++) {
			if (frequency[i] != 0){
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "bac";
		System.out.println(isPermutation(str1, str2));

	}

}
