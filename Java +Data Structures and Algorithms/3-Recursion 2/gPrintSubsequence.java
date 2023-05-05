package cRecursion2;

public class gPrintSubsequence {

	public static void printSubsequences(String input, String output) {
		if (input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		char ch = input.charAt(0);
		String roq = input.substring(1);
		
		printSubsequences(roq, output+ "");
		printSubsequences(roq,  output+ ch);
		
	}
	
	public static void main(String[] args) {
		printSubsequences("abc", "");

	}

}
