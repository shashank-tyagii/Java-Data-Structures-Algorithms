package iStrings;

public class jReverseEachWord {

	public static String reverseEachWord(String str) {
			String reverse = "";
			String word = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					reverse = reverse + word + ' ';
	                word = "";
				} else {
					word = str.charAt(i) + word;
				}
			}
			reverse = reverse+word;
			return reverse;
	}
	
	
	public static void main(String[] args) {
		String str= "My name is Shashank";
		System.out.println(reverseEachWord(str));
	}

}
