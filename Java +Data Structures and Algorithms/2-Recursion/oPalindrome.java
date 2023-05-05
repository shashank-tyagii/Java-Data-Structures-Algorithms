package bRecursion;

public class oPalindrome {
	
	public static boolean isStringPalindrome(String input, int start, int end) {
		
		if (start >= end) {
			return true;
		}
		boolean output;
		if (input.charAt(start) == input.charAt(end)) {
			output = isStringPalindrome(input, start+1, end-1);
		} else {
			output = false;
		}
		return output;

	}
	
	public static void main(String[] args) {
		boolean abc = isStringPalindrome("shabshs", 0, 6);
		System.out.println(abc);
	}

}
