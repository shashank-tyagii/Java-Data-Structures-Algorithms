// Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
package bRecursion;

public class sStringToInteger {

	public static int convertStringToInt(String input, int index){
		
		if (index == -1) {
			return 0;
		}
		
		int output;
		int c = (int)input.charAt(index) - '0';
		output = c + 10 * convertStringToInt(input, index-1);
		
		return output;
	}
	
	public static void main(String[] args) {
		int n = convertStringToInt("123456", 5);
		System.out.println(n);

	}

}
