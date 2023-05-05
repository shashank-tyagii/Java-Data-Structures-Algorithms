package bRecursion;

public class tPairStair {

	public static String addStars(String input, int startIndex) {
		if (startIndex == input.length()-1) {
			return "" + input.charAt(startIndex);
		}
		
		String output ;
		if (input.charAt(startIndex) == input.charAt(startIndex+1) ) {
			output = input.charAt(startIndex) + "*" + addStars(input, startIndex+1);
		} else {
			output = input.charAt(startIndex) + addStars(input, startIndex+1);
		}

		return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
