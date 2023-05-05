// Given a string, compute recursively a new string where all 'x' chars have been removed.
package bRecursion;

public class rRemoveX {
	
	public static String removeX(String input, int startIdx){
		
		if (startIdx == input.length()) {
			return "";
		}
		
		
		String output;
		
		if (input.charAt(startIdx) == 'x') {
			output = removeX(input, startIdx+1);
		} else {
			output = input.charAt(startIdx) + removeX(input, startIdx+1);
		}
		
		return output;
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
