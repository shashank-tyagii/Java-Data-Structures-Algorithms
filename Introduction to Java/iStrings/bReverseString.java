// Reverse a string
package iStrings;
public class bReverseString {

	public static String reverseString(String str) {
		String reverse = "";
		for (int i =0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		return reverse;
	}
	public static void main(String[] args) {
		String str= "Shashank";
		System.out.println(reverseString(str));
	}

}
