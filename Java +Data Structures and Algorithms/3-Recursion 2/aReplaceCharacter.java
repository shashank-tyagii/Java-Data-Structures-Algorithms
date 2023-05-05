// Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
package cRecursion2;

public class aReplaceCharacter {

	public static String replaceCharacter(String input, char c1, char c2, int index) {
		
		if (index == input.length()) {
			return "";
		}
		
		
		String output;
		
		if (input.charAt(index) == c1) {
			output = c2 + replaceCharacter(input, c1, c2, index+1);
		} else {
			output = input.charAt(index) + replaceCharacter(input, c1, c2, index+1);
		}
		
		
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
