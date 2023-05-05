// For a given a string(str), find and return the highest occurring character.
package iStrings;
public class lHighestOccuringCharacter {

	public static char highestOccuringChar(String str) {
		int[] frequency = new int[256];
		int max = 0;
		char c = (char)0;
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frequency[ch]++;
		}
		
		for (int i =0; i<256; i++) {
			if (frequency[i] > max) {
				max = frequency[i];
				c = (char)i;
			}
		}
		
		return c;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
