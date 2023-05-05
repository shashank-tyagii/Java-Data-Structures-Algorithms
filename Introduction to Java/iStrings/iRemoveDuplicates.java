// For a given string(str), remove all the consecutive duplicate characters.
package iStrings;
public class iRemoveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		
		String output = "";
		for (int i =0; i<str.length()-1;i++) {
			if (str.charAt(i) != str.charAt(i+1)) {
				output    = output+ str.charAt(i);
			}
		}
		output = output+ str.charAt(str.length()-1);
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
