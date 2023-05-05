// Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
// If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".
package iStrings;

public class mStringCompression {

	public static String getCompressedString(String str) {
		 int count =1;
			String output ="";
			for (int i =0; i < str.length(); i++) {
				if (i==0) {
					output = output + str.charAt(i);
				}
			    else if (str.charAt(i) == str.charAt(i-1)) {
					count++;
				}
				else if (str.charAt(i) != str.charAt(i-1)){
					if (count !=1) {output = output+count;}
	                output = output + str.charAt(i);
					count =1;
				}
			}
	        if (count >1) {output = output+count;}
			return output;
	}
	
	public static void main(String[] args) {
		System.out.println(getCompressedString("aaabbccccccd"));

	}

}
