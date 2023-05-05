//Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

package iStrings;
public class gReverseWordwise {

	public static String reverseWordWise(String input) {
		String reverse = "";
		String word = "";
		for (int i=0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				reverse = word +' ' + reverse;  // add before reverse string, back order
				word = "";
			} else {
				word = word + input.charAt(i);  // add in forward order
			}
		}
		reverse = word +' ' + reverse;
		return reverse;

	}
	public static void main(String[] args) {
		
		String str= "My name is Shashank";
		System.out.println(reverseWordWise(str));
	}


}
