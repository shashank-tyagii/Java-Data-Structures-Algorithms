// Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.

package cRecursion2;

public class fReturnKeypad {

	public static String[] keypad(int n){
		if (n<=0) {
			String[] ss = {""};
			return ss;
		}
		
		char[][] helper = {{}, {}, {'a','b','c'},{'d','e','f'}, {'g','h','i'}, {'j','k','l'} , {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
		
		
		int lastDigit = n%10;
		char[]  tempC = helper[lastDigit];
		String[] temp = keypad(n/10);
		String[] output = new String[temp.length * tempC.length];
		
		int k =0;
		for (int i =0; i < temp.length; i++) {
			for (int j =0; j< tempC.length; j++) {
				output[k] = temp[i]+ tempC[j];
				k++;
			}
		}
		
		return output;
	}
	public static void main(String[] args) {
		String[]out = keypad(23);
		for (int i =0; i < out.length; i++) {
			System.out.println(out[i]);	
		}

	}

}
