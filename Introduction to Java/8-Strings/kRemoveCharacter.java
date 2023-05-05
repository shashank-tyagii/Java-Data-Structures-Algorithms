// For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
// The input string will remain unchanged if the given character(X) doesn't exist in the input string.
package iStrings;
public class kRemoveCharacter {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String output="";
		for (int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c != ch) {
				output = output+ str.charAt(i);
			}
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		System.out.println(removeAllOccurrencesOfChar("Shashank", 'a'));

	}

}
